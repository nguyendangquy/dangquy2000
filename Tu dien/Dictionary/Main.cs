﻿using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;
using System.Data.SqlClient;

namespace dictionary
{
    public partial class Main : Form
    {
        #region Kết nối cơ sở dữ liệu
        //chuỗi kết nối
        static string path = Application.StartupPath;
        string strConn = @"Data Source=.\SQLEXPRESS;AttachDbFilename="+path+"\\data_tudien\\TuDien.mdf;Integrated Security=True;User Instance=True";
        // Tạo đối tượng kết nối
        SqlConnection conn = null;
        //doi tuong de dua dữ kiệu vào DataTable dtTuDien
        SqlDataAdapter daTuDien = null;
        //Tạo đói tượng hiển thị lên form
        DataTable dtTuDien = null;
        #endregion

        public Main()
        {
            InitializeComponent();
        }
        private void textBoxTuDien_MouseDoubleClick(object sender, MouseEventArgs e)
        {
            if (listBoxTuDien.Items.Count > 0)
            {
                listBoxTuDien.SelectedIndex = 0;
            }
        }

        #region Load dữ liệu lên listBoxuDien
        private void Main_Load(object sender, EventArgs e)
        {
            try
            {
                conn = new SqlConnection(strConn);
                daTuDien = new SqlDataAdapter("select * from table_tudien order by tentu_tienganh ASC", conn);
                dtTuDien = new DataTable();
                dtTuDien.Clear();
                daTuDien.Fill(dtTuDien);
                this.listBoxTuDien.DataSource = dtTuDien;
                this.listBoxTuDien.DisplayMember = "tentu_tienganh";
            }
            catch
            {
                MessageBox.Show("Không load được dữ liệu !", "Thông báo !", MessageBoxButtons.OK, MessageBoxIcon.Error);
                Application.Exit();
            }
        }
        #endregion

        #region Tìm từ trong danh sách
        private void textBoxTuDien_TextChanged(object sender, EventArgs e)
        {
            conn = new SqlConnection(strConn);
            daTuDien = new SqlDataAdapter("select * from table_tudien where tentu_tienganh like '" + this.textBoxTuDien.Text + "%' order by tentu_tienganh ASC", conn);
            dtTuDien = new DataTable();
            dtTuDien.Clear();
            daTuDien.Fill(dtTuDien);
            listBoxTuDien.DataSource = dtTuDien;
            this.listBoxTuDien.DisplayMember = "tentu_tienganh";
            if (listBoxTuDien.Items.Count > 0)
            {
                listBoxTuDien.SelectedIndex = 0;
            }
        }
        #endregion

        #region Chuyển phím
        private void textBoxTuDien_KeyDown(object sender, KeyEventArgs e)
        {
            if (e.KeyCode == Keys.Enter)
            {
                listBoxTuDien.SelectedItem = textBoxTuDien.Text;
            }
            if (e.KeyCode == Keys.Up)
            {
                listBoxTuDien.Focus();
            }
            if (e.KeyCode == Keys.Down)
            {
                listBoxTuDien.Focus();
            }
        }
        #endregion

        #region Hiển thị nghĩa lên richTextBoxTuDien
        private void listBoxTuDien_SelectedIndexChanged(object sender, EventArgs e)
        {
            conn = new SqlConnection(strConn);
            daTuDien = new SqlDataAdapter("select * from table_tudien where tentu_tienganh ='" + this.listBoxTuDien.Text + "'", conn);
            dtTuDien = new DataTable();
            dtTuDien.Clear();
            daTuDien.Fill(dtTuDien);
            if (dtTuDien != null)
            {
                if (dtTuDien.Rows.Count > 0)
                {
                    setRichTexBox(dtTuDien);
                }
            }
        }
        #endregion

        #region Định dạng hiển thị lên richTextBoxTuDien
        private void setRichTexBox(DataTable dtTuDien)
        {
            string st1 = "{\\rtf1\\ansi\\ansicpg1252\\deff0\\deflang1033\\deflangfe1041{\\fonttbl{\\f0\\fswiss\\fprq2\\fcharset0 Arial;}}"
                       + "{\\colortbl ;\\red255\\green0\\blue0;\\red255\\green0\\blue255;\\red0\\green176\\blue80;}"
                       + "{\\*\\generator Msftedit 5.41.21.2508;}\\viewkind4\\uc1\\pard\\nowidctlpar\\cf1\\b\\f0\\fs20 ";


            string st2 = "\\cf2\\b Lo\\u7841?i t\\u7915?     :\\cf0   [loaitu]\\par"
                        + "\\cf3 Gi\\u7843?i th\\'edch :\\par"
                        + "\\cf0\\b0      [giaithich]\\par"
                        + "\\par";


            string st3 = "}";
            string tt = "";
            string str = "";
            foreach (DataRow r in dtTuDien.Rows)
            {
                tt = st2;
                tt = tt.Replace("[loaitu]", DecodeString(r["loai_tu"].ToString()));
                tt = tt.Replace("[giaithich]", DecodeString(r["giaithich_tiengviet"].ToString()));
                str += tt;
            }
            str = st1 + str + st3;
            richTextBoxTuDien.Rtf = str;
        }
        #endregion

        #region Mã hóa từ
        private string DecodeString(string unicodeString)
        {
            Encoding uni = Encoding.Unicode;
            Byte[] encodedBytes = uni.GetBytes(unicodeString);
            int i = 0;
            int code = 0;
            string ret = "";
            for (i = 0; i < encodedBytes.Length - 1; )
            {
                code = BitConverter.ToUInt16(encodedBytes, i);
                if (code > 254)
                {
                    ret += "\\u" + code.ToString() + "?";
                }
                else if (code == 10) //Ma cua ky tu enter la 10
                {
                    ret += "\\par      ";
                }
                else
                {
                    ret += BitConverter.ToChar(encodedBytes, i);
                }

                i += 2;
            }
            return ret;
        }
        #endregion

        #region Xử lý button
        private void buttonQuanLy_Click(object sender, EventArgs e)
        {
            formQuanLy ql = new formQuanLy();
            ql.ShowDialog();
        }

        private void buttonThongTin_Click(object sender, EventArgs e)
        {
            formThongTin tt = new formThongTin();
            tt.ShowDialog(); ;
        }

        private void buttonThoat_Click(object sender, EventArgs e)
        {
            DialogResult traloi;
                    traloi = MessageBox.Show("Bạn có chắc chắn thoát không?", "Trả lời ?", MessageBoxButtons.OKCancel, MessageBoxIcon.Warning);
                    if (traloi == DialogResult.OK)
                    {
                        Application.Exit();
                    }
        }

        private void richTextBoxTuDien_TextChanged(object sender, EventArgs e)
        {

        }
        #endregion
        //Mã sinh viên - Họ tên - Tên ứng dụng
    }
}
