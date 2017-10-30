using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace HelloCSharpWin
{
    public partial class Calc : Form
    {
        public Calc()
        {
            InitializeComponent();
        }
        public static int op = 0;

        private void HelloLabel_Click(object sender, EventArgs e)
        {
            HelloLabel.Text = "Hello C#";
        }

        private void SumNumbers_Click(object sender, EventArgs e)
        {
            int numChk = 0;
            if (String.IsNullOrWhiteSpace(Sum1.Text))
            {
                MessageBox.Show("첫번째 숫자를 입력해 주세요");
                Sum1.Focus();
                return;
            }
            if (!int.TryParse(Sum1.Text, out numChk))
            {
                MessageBox.Show("올바른 첫번째 숫자를 입력해 주세요");
                Sum1.SelectAll();
                Sum1.Focus();
                return;
            }

            if (String.IsNullOrWhiteSpace(Sum2.Text))
            {
                MessageBox.Show("두번째 숫자를 입력해 주세요");
                Sum2.Focus();
                return;
            }
            else if (!int.TryParse(Sum2.Text, out numChk)) {
                MessageBox.Show("올바른 두번째 숫자를 입력해 주세요");
                Sum2.SelectAll();
                Sum2.Focus();
                return;
            }
            else if (op == 0)
            {
                MessageBox.Show("연산자를 선택해 주세요");
                btnAdd.Focus();
                return;
            }
            else
            {
                int num1 = Convert.ToInt32(Sum1.Text);
                int num2 = Convert.ToInt32(Sum2.Text);
                int sum = 0;

                switch (op)
                {
                    case 1:
                        sum = Add(num1, num2);
                        break;
                    case 2: break;
                    case 3: break;
                    case 4: break;
                    default:
                        break;
                }

                SumResult.Text = sum.ToString();
                op = 0;
            }
        }

        public int Add(int num1, int num2)
        {
            return num1 + num2;
        }
        public int Sub(int num1, int num2)
        {
            return num1 - num2;
        }
        public int Mul(int num1, int num2)
        {
            return num1 * num2;
        }
        public int Div(int num1, int num2)
        {
            return num1 / num2;
        }

        private void btnAdd_Click(object sender, EventArgs e)
        {
            op = 1;
        }

        private void Calc_Load(object sender, EventArgs e)
        {

        }
    }
}
