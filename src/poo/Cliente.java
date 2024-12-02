/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

import java.io.Serializable;

/**
 *
 * @author ANGEL
 */
public class Cliente implements Serializable
{
    public static final long SVUID=1L;
    private String folioCliente;
    private String nom;
    private char formaPago;
    private String fecha;
    private static int cons=0;

    public Cliente()
    {
    }

    public Cliente(String nom, char formaPago, String fecha)
    {
        cons++;
        this.folioCliente =  String.valueOf(cons);
        this.nom = nom;
        this.formaPago = formaPago;
        this.fecha = fecha;
    }

    /**
     * @return the folioCiente
     */
    public String getFolioCliente()
    {
        return folioCliente;
    }

    /**
     * @param folioCiente the folioCiente to set
     */
    public void setFolioCiente(String folioCiente)
    {
        this.folioCliente = folioCiente;
    }

    /**
     * @return the nom
     */
    public String getNom()
    {
        return nom;
    }

    /**
     * @param nom the nom to set
     */
    public void setNom(String nom)
    {
        this.nom = nom;
    }

    /**
     * @return the formaPago
     */
    public char getFormaPago()
    {
        return formaPago;
    }

    /**
     * @param formaPago the formaPago to set
     */
    public void setFormaPago(char formaPago)
    {
        this.formaPago = formaPago;
    }

    /**
     * @return the fecha
     */
    public String getFecha()
    {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(String fecha)
    {
        this.fecha = fecha;
    }
     /**
     * @return the cons
     */
    public static int getCons()
    {
        return cons;
    }

    /**
     * @param cons the cons to set
     */
    public static void setCons(int aCons)
    {
        cons = aCons;
    }

    @Override
    public String toString()
    {
        String y="";
        for (int i = 0; i <5-folioCliente.length() ; i++)
        {
            y+=0;
        }
        y+=folioCliente;
        return "\n FolioCliente: " + y + "\t nombre: " + nom + "\t Forma Pago: " + formaPago + "\t Fecha: " + fecha ;
    }

   
    
    
    
}
