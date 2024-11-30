/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

import cjb.ci.Mensajes;

/**
 *
 * @author aange
 */
public class Examen
{

    public static void buscarStatusEspera(Viaje[][] v, Socio[] s, Cliente[] c)
    {
        if (s == null || v == null)
        {
            System.out.println("No se encontro ningun viaje");
        } else
        {

            for (int i = 0; i < v.length; i++)
            {
                if (v[i] != null)
                {
                    for (int j = 0; j < v[i].length; j++)
                    {
                        if ('E' == v[i][j].getStatus())
                        {
                            String t = v[i][j].getFolioCliente();

                            System.out.println(Manipulacion.despC(c, Integer.parseInt(t)));
                            System.out.println(Manipulacion.despS(s, i));
                            System.out.println("Origen" + v[i][j].getOrigen() + "Destino" + v[i][j].getDestino());

                        }

                    }

                }

            }

        }
        System.out.println("No se encontro ningun viaje en espera");
    }

    public static void consultaSocioConMasGanancias(Viaje[][] v, Socio[] s)
    {
        double y = 0;
        double Mon = 0;
        int tmp = 0;
        if (v == null)
        {
            System.out.println("Sin Viajes");
        } else
        {
            for (int i = 0; i < 10; i++)
            {
                System.out.println("Socio: " + s[i].getNom());
                if (v[i] == null)
                {
                    System.out.println("Sin Viajes");
                } else
                {
                    for (int j = 0; j < v[i].length; j++)
                    {
                        if (v[i][j] != null)
                        {
                            if (v[i][j].getStatus() == 'T')
                            {
                                y = y + v[i][j].getMonto();
                            }

                        }

                    }
                    if (y == 0)
                    {
                        System.out.println("Aun no tienes ganancias");
                    } else
                    {
                        System.out.println("Su total de ganancias: " + y);
                        if (y > Mon)
                        {
                            tmp = i;
                            Mon = y;
                        }
                    }

                }

            }
            System.out.println("Socio con mayor igresos es: " + s[tmp].getNom() + "con " + Mon);

        }

    }

    public static void consultaViajesTermonados(Viaje[][] v, Socio[] s)
    {
        int tmp = 0, vT = 0, tmp2 = 0;
        if (v == null)
        {
            System.out.println("Sin Viajes");
        } else
        {
            for (int i = 0; i < 10; i++)
            {
                System.out.println("Socio: " + s[i].getNom());
                if (v[i] == null)
                {
                    System.out.println("Sin Viajes");
                } else
                {

                    for (int j = 0; j < v[i].length; j++)
                    {
                        if (v[i][j] != null)
                        {
                            if (v[i][j].getStatus() == 'T')
                            {
                                vT = vT + 1;

                            }
                        }
                    }
                    if (vT > tmp2)
                    {
                        tmp = i;
                        tmp2 = vT;

                    }
                }

            }
            System.out.println("Socio con más viajes terminados es: " + s[tmp].getNom() + "con " + tmp2 + "Viajes terminados");

        }

    }

}
