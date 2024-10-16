/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Usuario;

/**
 *
 * @author david
 */
public class Login {
    
    
    public boolean validarUsuario(String usuario, String contraseña)
    {
    boolean usuariovalidado = false;
    
    if (("TACA").equals(usuario) && ("tacatic").equals(contraseña))
    
    {
    usuariovalidado = true;
    }
    return usuariovalidado;
    }
    
}
