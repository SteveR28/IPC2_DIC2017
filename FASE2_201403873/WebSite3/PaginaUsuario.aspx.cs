using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

public partial class PaginaUsuario : System.Web.UI.Page
{
    servicio.Webservice2Client conex = new servicio.Webservice2Client();
    protected void Page_Load(object sender, EventArgs e)
    {

    }

    protected void Button2_Click(object sender, EventArgs e)
    {
        codi.Text = codigo.Text;
        nom.Text = nombre.Text;
        fechi.Text = fechai.Text;
        fechf.Text = fechaf.Text;
        pag.Text = pago.Text;
        nick.Text = nickname.Text;

        codigo.Text = "";
        nombre.Text = "";
        fechai.Text = "";
        fechaf.Text = "";
        pago.Text = "";
        nickname.Text = "";

    }

    protected void Button1_Click(object sender, EventArgs e)
    {
        int a = Convert.ToInt32(codigo.Text);
        string b = Convert.ToString(nombre.Text);
        string c = Convert.ToString(fechai.Text);
        string d = Convert.ToString(fechaf.Text);
        int s = Convert.ToInt32(pago.Text);
        string m = Convert.ToString(nickname.Text);
        conex.CrearProyecto(a, b, c, d, s, m);
    }

    protected void Button3_Click(object sender, EventArgs e)
    {
        int est = Convert.ToInt32(noestado.Text);
        string dees = Convert.ToString(descripcion.Text);
        string nick = Convert.ToString(nicknamecoment.Text);

        conex.IngresarEstado(est, dees, nick);


        estad.Text = noestado.Text;
        des.Text = descripcion.Text;
        n2.Text = nicknamecoment.Text;

        noestado.Text = "";
        descripcion.Text = "";
        nicknamecoment.Text = "";


    }

    protected void Button4_Click(object sender, EventArgs e)
    {
        int aa = Convert.ToInt32(coditarea.Text);
        string bb = Convert.ToString(nombret.Text);
        string cc = Convert.ToString(descrip.Text);
        string dd = Convert.ToString(fechaitarea.Text);
        string ss = Convert.ToString(requisitos.Text);
        int ww = Convert.ToInt32(pagot.Text);
        string mm = Convert.ToString(nicktarea.Text);
        conex.CrearTareaIndividual(aa, bb, cc, dd, ss, ww, mm);
    }

    protected void Button5_Click(object sender, EventArgs e)
    {
        codta.Text = coditarea.Text;
        nomt.Text = nombret.Text;
        dest.Text = descrip.Text;
        itarea.Text = fechaitarea.Text;
        requi.Text = requisitos.Text;
        pagt.Text = pagot.Text;
        nickt.Text = nicktarea.Text;

        coditarea.Text = "";
        nombret.Text = "";
        descrip.Text = "";
        fechaitarea.Text = "";
        requisitos.Text = "";
        pagot.Text = "";
        nicktarea.Text = "";
    }

    protected void Button6_Click(object sender, EventArgs e)
    {
        int aaa = Convert.ToInt32(codtp.Text);
        string bbb = Convert.ToString(nombretp.Text);
        string ccc = Convert.ToString(destp.Text);
        string ddd = Convert.ToString(fecitp.Text);
        string sss = Convert.ToString(requitp.Text);
        int www = Convert.ToInt32(pagotp.Text);
        string cotp = Convert.ToString(codprotp.Text);
        conex.CrearTareaProyecto(aaa, bbb, ccc, ddd, sss, www, cotp);
    }

    protected void Button7_Click(object sender, EventArgs e)
    {
        ctp.Text = codtp.Text;
        ntp.Text = nombretp.Text;
        dtp.Text = destp.Text;
        itp.Text = fecitp.Text;
        rtp.Text = requitp.Text;
        ptp.Text = pagotp.Text;
        cptp.Text = codprotp.Text;

        codtp.Text = "";
        nombretp.Text = "";
        destp.Text = "";
        fecitp.Text = "";
        requitp.Text = "";
        pagotp.Text = "";
        codprotp.Text = "";
    }

    protected void Button8_Click(object sender, EventArgs e)
    {
        int aaaa = Convert.ToInt32(codhab.Text);
        string bbbb = Convert.ToString(nombrehab.Text);
        string cccc = Convert.ToString(resumen.Text);
        string dddd = Convert.ToString(nickhab.Text);
        string ssss = Convert.ToString(karma.Text);
        conex.IngresarHabilidad(aaaa, bbbb, cccc, dddd, ssss);
    }

    protected void Button9_Click(object sender, EventArgs e)
    {
        ch.Text = codhab.Text;
        nh.Text = nombrehab.Text;
        rh.Text = resumen.Text;
        nih.Text = nickhab.Text;
        kah.Text = karma.Text;

        codhab.Text = "";
        nombrehab.Text = "";
        resumen.Text = "";
        nickhab.Text = "";
        karma.Text = "";
        
    }

    protected void Button10_Click(object sender, EventArgs e)
    {
        int asoa = Convert.ToInt32(codaso.Text);
        string asob = Convert.ToString(nombreaso.Text);
        string asoc = Convert.ToString(resumenaso.Text);
        string asod = Convert.ToString(logo.Text);
        
        conex.CrearAsociacion(asoa, asob, asoc, asod);
    }

    protected void Button11_Click(object sender, EventArgs e)
    {
        ca.Text = codaso.Text;
        naso.Text = nombreaso.Text;
        raso.Text = resumenaso.Text;
        log.Text = logo.Text;
        

        codaso.Text = "";
        nombreaso.Text = "";
        resumenaso.Text = "";
        logo.Text = "";
        
    }
}