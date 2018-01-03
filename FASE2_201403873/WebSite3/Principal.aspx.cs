using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

public partial class Principal : System.Web.UI.Page
{
    servicio.Webservice2Client conex = new servicio.Webservice2Client();
    protected void Page_Load(object sender, EventArgs e)
    {

    }

    protected void Button1_Click(object sender, EventArgs e)
    {

        string a = Convert.ToString(nickname.Text);
        string b = Convert.ToString(nombre.Text);
        string c = Convert.ToString(correo.Text);
        string d = Convert.ToString(fechanac.Text);
        string s = Convert.ToString(contra.Text);
        conex.CrearUsuario(a, b, c, d, s);

    }

    protected void Button2_Click(object sender, EventArgs e)
    {
        nickname.Text = "";
        nombre.Text = "";
        correo.Text = "";
        fechanac.Text = "";
        contra.Text = "";
        


    }
}