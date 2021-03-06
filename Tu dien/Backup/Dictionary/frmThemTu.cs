using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Text;
using System.Windows.Forms;
using dictionary.db;

namespace dictionary
{
    public partial class frmThemTu : Form
    {
        private dao db;
        private string idSelected;
        public frmThemTu()
        {
            InitializeComponent();
        }

        private void frmThemTu_Load(object sender, EventArgs e)
        {
            db = new dao();
            DataTable tbl = db.getListWord();
            fillListWord(tbl);
        }

        private void txtNgiaAnh_TextChanged(object sender, EventArgs e)
        {

        }
        private void fillListWord(DataTable tbl)
        {                       
            dataGridView1.DataSource = tbl;
            dataGridView1.Columns[0].Visible = false;
            dataGridView1.Columns[1].HeaderText = "Từ tiếng anh";
            dataGridView1.Columns[2].HeaderText = "Từ tiếng việt";
            dataGridView1.Columns[3].HeaderText = "Loại từ";
            dataGridView1.Columns[4].HeaderText = "Giải thích tiếng anh";
            dataGridView1.Columns[5].HeaderText = "Giải thích tiếng việt";
            dataGridView1.RowHeadersWidth = 20;
            dataGridView1.Columns[4].Width = 100;
            dataGridView1.Columns[5].Width = 180;
          //  dataGridView1.Columns[1].DefaultCellStyle.BackColor = Color.Blue;
           
        }

   
        private void listWjord_ItemSelectionChanged(object sender, ListViewItemSelectionChangedEventArgs e)
        {
            txtNghiaAnh.Text = e.Item.SubItems[1].Text;
            txtNghiaViet.Text = e.Item.SubItems[2].Text;
            rtbGiaiThichAnh.Text = e.Item.SubItems[3].Text;
            rtbGiaiThichViet.Text = e.Item.SubItems[4].Text;
            // cbbLoaiTu.Text = e.Item.SubItems[5].Text;
            idSelected = e.Item.SubItems[0].Text;
        }

        private void cbbLoaiTu_SelectedIndexChanged(object sender, EventArgs e)
        {

        }

        private void btnXoa_Click(object sender, EventArgs e)
        {
            if (idSelected != null || idSelected != "")
            {
                db.deleteWord(idSelected);
                DataTable tbl = db.getListWord();
                fillListWord(tbl);
            }
        }

        private void btnThem_Click(object sender, EventArgs e)
        {
            db.insertWord(txtNghiaAnh.Text, txtNghiaViet.Text, rtbGiaiThichAnh.Text, rtbGiaiThichViet.Text, cbbLoaiTu.Text);
            DataTable tbl = db.getListWord();
            fillListWord(tbl);
        }

        private void btnSua_Click(object sender, EventArgs e)
        {
            if (idSelected != null || idSelected == "")
            {
                db.updateWord(idSelected, txtNghiaAnh.Text, txtNghiaViet.Text, rtbGiaiThichAnh.Text, rtbGiaiThichViet.Text, cbbLoaiTu.Text);
                DataTable tbl = db.getListWord();
                fillListWord(tbl);
            }
        }

        private void btnThoat_Click(object sender, EventArgs e)
        {
            db.closeConn();
            this.Close();
        }

        private void dataGridView1_CellContentClick(object sender, DataGridViewCellEventArgs e)
        {
            if (e.RowIndex >= 0)
            {
                txtNghiaAnh.Text = dataGridView1.Rows[e.RowIndex].Cells["tentu_tienganh"].Value.ToString();
                txtNghiaViet.Text = dataGridView1.Rows[e.RowIndex].Cells["tentu_tiengviet"].Value.ToString();
                rtbGiaiThichAnh.Text = dataGridView1.Rows[e.RowIndex].Cells["giaithich_tienganh"].Value.ToString();
                rtbGiaiThichViet.Text = dataGridView1.Rows[e.RowIndex].Cells["giaithich_tiengviet"].Value.ToString();
                cbbLoaiTu.Text = dataGridView1.Rows[e.RowIndex].Cells["Loai_tu"].Value.ToString();
                idSelected = dataGridView1.Rows[e.RowIndex].Cells["id"].Value.ToString();
            }
         }
    }
}