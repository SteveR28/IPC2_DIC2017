<%@ Page Language="C#" AutoEventWireup="true" CodeFile="Principal.aspx.cs" Inherits="Principal" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title></title>
    <style type="text/css">
        .auto-style1 {
            width: 100px;
        }
        .auto-style2 {
            width: 101px;
        }
        .auto-style3 {
            margin-left: 71px;
        }
    </style>
</head>
<body>
    <form id="form1" runat="server">
    <div>
    
        IPC2 VACACIONES DICIEMBRE 2017<br />
        STEVE MAKEY RAMIREZ RUANO<br />
        201403873<br />
        FASE 2<br />
        <br />
        INGRESE DATOS DE USUARIO</div>

    <table>
        <tr>
            <td class="auto-style2">

                Nickname</td>
            <td class="auto-style1">

                <asp:TextBox ID="nickname" runat="server"></asp:TextBox>

                </td>
            </tr>
        <tr>
            <td class="auto-style2">

                Nombre</td>
            <td class="auto-style1">

                <asp:TextBox ID="nombre" runat="server"></asp:TextBox>

                </td>
            </tr>
        <tr>
            <td class="auto-style2">

                Correo</td>
            <td class="auto-style1">

                <asp:TextBox ID="correo" runat="server"></asp:TextBox>

                </td>
            </tr>
        <tr>
            <td class="auto-style2">

                Fecha Nac.</td>
            <td class="auto-style1">

                <asp:TextBox ID="fechanac" runat="server">AAAA-MM-DD</asp:TextBox>

                </td>
            </tr>
        <tr>
            <td class="auto-style2">

                Contraseña</td>
            <td class="auto-style1">

                <asp:TextBox ID="contra" runat="server"></asp:TextBox>

                </td>
            </tr>

        </table>
        <p>
            <asp:Button ID="Button1" runat="server" OnClick="Button1_Click" Text="Registrar" />
            <asp:Button ID="Button2" runat="server" CssClass="auto-style3" OnClick="Button2_Click" Text="Ir a pagina" />
            
    
        </p> 
    </form>

    </body>
</html>
