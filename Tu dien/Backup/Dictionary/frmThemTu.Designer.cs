namespace dictionary
{
    partial class frmThemTu
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(frmThemTu));
            this.btnThem = new System.Windows.Forms.Button();
            this.btnSua = new System.Windows.Forms.Button();
            this.btnXoa = new System.Windows.Forms.Button();
            this.btnThoat = new System.Windows.Forms.Button();
            this.label1 = new System.Windows.Forms.Label();
            this.label2 = new System.Windows.Forms.Label();
            this.label3 = new System.Windows.Forms.Label();
            this.label4 = new System.Windows.Forms.Label();
            this.txtNghiaAnh = new System.Windows.Forms.TextBox();
            this.txtNghiaViet = new System.Windows.Forms.TextBox();
            this.rtbGiaiThichAnh = new System.Windows.Forms.RichTextBox();
            this.rtbGiaiThichViet = new System.Windows.Forms.RichTextBox();
            this.label5 = new System.Windows.Forms.Label();
            this.cbbLoaiTu = new System.Windows.Forms.ComboBox();
            this.dataGridView1 = new System.Windows.Forms.DataGridView();
            ((System.ComponentModel.ISupportInitialize)(this.dataGridView1)).BeginInit();
            this.SuspendLayout();
            // 
            // btnThem
            // 
            this.btnThem.Location = new System.Drawing.Point(32, 285);
            this.btnThem.Name = "btnThem";
            this.btnThem.Size = new System.Drawing.Size(75, 23);
            this.btnThem.TabIndex = 0;
            this.btnThem.Text = "Thêm";
            this.btnThem.UseVisualStyleBackColor = true;
            this.btnThem.Click += new System.EventHandler(this.btnThem_Click);
            // 
            // btnSua
            // 
            this.btnSua.Location = new System.Drawing.Point(202, 285);
            this.btnSua.Name = "btnSua";
            this.btnSua.Size = new System.Drawing.Size(75, 23);
            this.btnSua.TabIndex = 2;
            this.btnSua.Text = "Sửa";
            this.btnSua.UseVisualStyleBackColor = true;
            this.btnSua.Click += new System.EventHandler(this.btnSua_Click);
            // 
            // btnXoa
            // 
            this.btnXoa.Location = new System.Drawing.Point(385, 285);
            this.btnXoa.Name = "btnXoa";
            this.btnXoa.Size = new System.Drawing.Size(75, 23);
            this.btnXoa.TabIndex = 3;
            this.btnXoa.Text = "Xoá";
            this.btnXoa.UseVisualStyleBackColor = true;
            this.btnXoa.Click += new System.EventHandler(this.btnXoa_Click);
            // 
            // btnThoat
            // 
            this.btnThoat.Location = new System.Drawing.Point(578, 285);
            this.btnThoat.Name = "btnThoat";
            this.btnThoat.Size = new System.Drawing.Size(75, 23);
            this.btnThoat.TabIndex = 4;
            this.btnThoat.Text = "Thoát";
            this.btnThoat.UseVisualStyleBackColor = true;
            this.btnThoat.Click += new System.EventHandler(this.btnThoat_Click);
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Font = new System.Drawing.Font("Microsoft Sans Serif", 9.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label1.Location = new System.Drawing.Point(19, 38);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(116, 16);
            this.label1.TabIndex = 5;
            this.label1.Text = "Nghĩa Tiếng Anh :";
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Font = new System.Drawing.Font("Microsoft Sans Serif", 9.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label2.Location = new System.Drawing.Point(336, 39);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(111, 16);
            this.label2.TabIndex = 6;
            this.label2.Text = "Nghĩa tiếng việt : ";
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Font = new System.Drawing.Font("Microsoft Sans Serif", 9.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label3.Location = new System.Drawing.Point(19, 121);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(125, 16);
            this.label3.TabIndex = 7;
            this.label3.Text = "Giải thích tiếng anh :";
            // 
            // label4
            // 
            this.label4.AutoSize = true;
            this.label4.Font = new System.Drawing.Font("Microsoft Sans Serif", 9.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label4.Location = new System.Drawing.Point(336, 122);
            this.label4.Name = "label4";
            this.label4.Size = new System.Drawing.Size(124, 16);
            this.label4.TabIndex = 8;
            this.label4.Text = "Giải thích tiếng việt :";
            // 
            // txtNghiaAnh
            // 
            this.txtNghiaAnh.Location = new System.Drawing.Point(144, 37);
            this.txtNghiaAnh.Name = "txtNghiaAnh";
            this.txtNghiaAnh.Size = new System.Drawing.Size(177, 20);
            this.txtNghiaAnh.TabIndex = 9;
            this.txtNghiaAnh.TextChanged += new System.EventHandler(this.txtNgiaAnh_TextChanged);
            // 
            // txtNghiaViet
            // 
            this.txtNghiaViet.Location = new System.Drawing.Point(466, 37);
            this.txtNghiaViet.Name = "txtNghiaViet";
            this.txtNghiaViet.Size = new System.Drawing.Size(187, 20);
            this.txtNghiaViet.TabIndex = 10;
            // 
            // rtbGiaiThichAnh
            // 
            this.rtbGiaiThichAnh.Location = new System.Drawing.Point(144, 121);
            this.rtbGiaiThichAnh.Name = "rtbGiaiThichAnh";
            this.rtbGiaiThichAnh.Size = new System.Drawing.Size(177, 141);
            this.rtbGiaiThichAnh.TabIndex = 11;
            this.rtbGiaiThichAnh.Text = "";
            // 
            // rtbGiaiThichViet
            // 
            this.rtbGiaiThichViet.Location = new System.Drawing.Point(466, 124);
            this.rtbGiaiThichViet.Name = "rtbGiaiThichViet";
            this.rtbGiaiThichViet.Size = new System.Drawing.Size(187, 138);
            this.rtbGiaiThichViet.TabIndex = 12;
            this.rtbGiaiThichViet.Text = "";
            // 
            // label5
            // 
            this.label5.AutoSize = true;
            this.label5.Font = new System.Drawing.Font("Microsoft Sans Serif", 9.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label5.Location = new System.Drawing.Point(19, 82);
            this.label5.Name = "label5";
            this.label5.Size = new System.Drawing.Size(53, 16);
            this.label5.TabIndex = 13;
            this.label5.Text = "Loại từ :";
            // 
            // cbbLoaiTu
            // 
            this.cbbLoaiTu.FormattingEnabled = true;
            this.cbbLoaiTu.Items.AddRange(new object[] {
            "Động từ",
            "Danh từ",
            "Tính từ",
            "Trạng từ",
            "Giới từ",
            "Tiền tố",
            "Mạo từ",
            "Phó từ",
            "Đại từ chỉ định"});
            this.cbbLoaiTu.Location = new System.Drawing.Point(144, 77);
            this.cbbLoaiTu.Name = "cbbLoaiTu";
            this.cbbLoaiTu.Size = new System.Drawing.Size(177, 21);
            this.cbbLoaiTu.TabIndex = 14;
            this.cbbLoaiTu.SelectedIndexChanged += new System.EventHandler(this.cbbLoaiTu_SelectedIndexChanged);
            // 
            // dataGridView1
            // 
            this.dataGridView1.AllowUserToAddRows = false;
            this.dataGridView1.AllowUserToDeleteRows = false;
            this.dataGridView1.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.dataGridView1.EditMode = System.Windows.Forms.DataGridViewEditMode.EditOnF2;
            this.dataGridView1.Location = new System.Drawing.Point(32, 329);
            this.dataGridView1.MultiSelect = false;
            this.dataGridView1.Name = "dataGridView1";
            this.dataGridView1.ReadOnly = true;
            this.dataGridView1.SelectionMode = System.Windows.Forms.DataGridViewSelectionMode.FullRowSelect;
            this.dataGridView1.Size = new System.Drawing.Size(621, 212);
            this.dataGridView1.TabIndex = 15;
            this.dataGridView1.CellEnter += new System.Windows.Forms.DataGridViewCellEventHandler(this.dataGridView1_CellContentClick);
            this.dataGridView1.CellContentClick += new System.Windows.Forms.DataGridViewCellEventHandler(this.dataGridView1_CellContentClick);
            // 
            // frmThemTu
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackColor = System.Drawing.Color.MediumSeaGreen;
            this.ClientSize = new System.Drawing.Size(685, 568);
            this.Controls.Add(this.dataGridView1);
            this.Controls.Add(this.cbbLoaiTu);
            this.Controls.Add(this.label5);
            this.Controls.Add(this.rtbGiaiThichViet);
            this.Controls.Add(this.rtbGiaiThichAnh);
            this.Controls.Add(this.txtNghiaViet);
            this.Controls.Add(this.txtNghiaAnh);
            this.Controls.Add(this.label4);
            this.Controls.Add(this.label3);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.label1);
            this.Controls.Add(this.btnThoat);
            this.Controls.Add(this.btnXoa);
            this.Controls.Add(this.btnSua);
            this.Controls.Add(this.btnThem);
            this.FormBorderStyle = System.Windows.Forms.FormBorderStyle.FixedSingle;
            this.Icon = ((System.Drawing.Icon)(resources.GetObject("$this.Icon")));
            this.MaximizeBox = false;
            this.Name = "frmThemTu";
            this.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen;
            this.Text = "Format";
            this.Load += new System.EventHandler(this.frmThemTu_Load);
            ((System.ComponentModel.ISupportInitialize)(this.dataGridView1)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Button btnThem;
        private System.Windows.Forms.Button btnSua;
        private System.Windows.Forms.Button btnXoa;
        private System.Windows.Forms.Button btnThoat;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.Label label4;
        private System.Windows.Forms.TextBox txtNghiaAnh;
        private System.Windows.Forms.TextBox txtNghiaViet;
        private System.Windows.Forms.RichTextBox rtbGiaiThichAnh;
        private System.Windows.Forms.RichTextBox rtbGiaiThichViet;
        private System.Windows.Forms.Label label5;
        private System.Windows.Forms.ComboBox cbbLoaiTu;
        private System.Windows.Forms.DataGridView dataGridView1;
    }
}