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
public class Socio implements Serializable
{
    public static final long SVUID=1L;
    private String numSocio;
    private String nom;
    private String placas;
    private String modelo;
    private String fecha;
    private static int cons=0;

    public Socio()
    {
    }

    public Socio( String nom, String placas, String modelo, String fecha)
    {
        cons++;
        this.numSocio =  String.valueOf(cons);
        this.nom = nom;
        this.placas = placas;
        this.modelo = modelo;
        this.fecha = fecha;
    }

    /**
     * @return the numSocio
     */
    public String getNumSocio()
    {
        return numSocio;
    }

    /**
     * @param numSocio the numSocio to set
     */
    public void setNumSocio(String numSocio)
    {
        this.numSocio = numSocio;
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
     * @return the placas
     */
    public String getPlacas()
    {
        return placas;
    }

    /**
     * @param placas the placas to set
     */
    public void setPlacas(String placas)
    {
        this.placas = placas;
    }

    /**
     * @return the modelo
     */
    public String getModelo()
    {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo)
    {
        this.modelo = modelo;
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
        String y = "";
        for (int i = 0; i < 5 - numSocio.length(); i++)
        {
            y += 0;
        }
        y += numSocio;
        return  "\t Numero socio: " + y + "\t Nombre: " + nom + "\t Placas: " + placas + "\t Modelo: " + modelo + "\t Fecha: " + fecha + "\n";
    }

    
    
    
    
}
