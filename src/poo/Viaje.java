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
public class Viaje implements Serializable
{

    private static long SVUID = 1L;
    private String folioCliente;
    private String origen;
    private String destino;
    private char status;
    private String fecha;
    private double monto;

    public Viaje()
    {
    }

    public Viaje(String folioCliente, String origen, String destino, char status, String fecha, double monto)
    {
        this.folioCliente = folioCliente;
        this.origen = origen;
        this.destino = destino;
        this.status = status;
        this.fecha = fecha;
        this.monto = monto;
    }

    /**
     * @return the folioCliente
     */
    public String getFolioCliente()
    {
        return folioCliente;
    }

    /**
     * @param folioCliente the folioCliente to set
     */
    public void setFolioCliente(String folioCliente)
    {
        this.folioCliente = folioCliente;
    }

    /**
     * @return the origen
     */
    public String getOrigen()
    {
        return origen;
    }

    /**
     * @param origen the origen to set
     */
    public void setOrigen(String origen)
    {
        this.origen = origen;
    }

    /**
     * @return the destino
     */
    public String getDestino()
    {
        return destino;
    }

    /**
     * @param destino the destino to set
     */
    public void setDestino(String destino)
    {
        this.destino = destino;
    }

    /**
     * @return the status
     */
    public char getStatus()
    {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(char status)
    {
        this.status = status;
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
     * @return the monto
     */
    public double getMonto()
    {
        return monto;
    }

    /**
     * @param monto the monto to set
     */
    public void setMonto(double monto)
    {
        this.monto = monto;
    }

    /**
     * @return the SVUID
     */
    public static long getSVUID()
    {
        return SVUID;
    }

    /**
     * @param aSVUID the SVUID to set
     */
    public static void setSVUID(long aSVUID)
    {
        SVUID = aSVUID;
    }
    
    @Override
    public String toString()
    {
        String y = "";
        for (int i = 0; i < 5 - folioCliente.length(); i++)
        {
            y += 0;
        }
        y += folioCliente;
        return "\tFolio cliente: " + y + "\tOrigen: " + origen + "\tDestino: " + destino + 
                "\tEtatus: " + status + "\tFecha: " + fecha + "\tMonto: " + monto ;
    }

}