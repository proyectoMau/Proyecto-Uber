/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo;

/**
 *
 * @author ANGEL
 */
public class PrbProyectoUber
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Cliente[] c = null;
        Socio[] s = null;
        Viaje[][] v = null;
        Viaje[][] tmpV = null;
        Viaje tmpC = null;

        String mnu1[] =
        {
            "Cliente ", "Socio", "Salir "
        };
        String mnuC[] =
        {
            "Registro ", "Cliente registrado", "Salir "
        };
        String mnuC1[] =
        {
            "Solicita viaje", "Cancela Viaje", "Consulta Viajes", "consulta gastos", "Reasignar", "Salir "
        };
        String mnuS1[] =
        {
            "Modificacion de datos", "Iniciar Viaje", "Cancela Viaje", "Terminar Viaje", "Consulta Viajes", "Consulta de ganancias", "Salir "
        };
        String mnuS[] =
        {
            "Registro ", "Socio ya registrado", "Salir "
        };
        String mnuM[] =
        {
            "Placa ", "Modelo", "Salir "
        };

        int opc1, opc2, opc3, opc4, opc5, pos = 0, opc6;
        String nS = " ", fC = " ", nom = " ", nomS = " ";

        s = (Socio[]) ManipulaArchivos.cargaAS("Socios.dat");
        try
        {
            Socio.setCons((int) ManipulaArchivos.cargaS("foliosS.dat"));
        } catch (Exception e)
        {
            Socio.setCons(0);
        }
        c = (Cliente[]) ManipulaArchivos.cargaAC("Clientes.dat");
        try
        {
            Cliente.setCons((int) ManipulaArchivos.cargaC("foliosC.dat"));
        } catch (Exception e)
        {
            Cliente.setCons(0);
        }

        do
        {
            opc1 = Manipulacion.pintaMenu(mnu1, "Menu general");
            switch (opc1)
            {
                case 1:
                    do
                    {
                        opc2 = Manipulacion.pintaMenu(mnuC, "Cliente");
                        switch (opc2)
                        {
                            case 1, 2:
                                if (opc2 == 1)
                                {
                                    c = Manipulacion.insertaCliente(c, Manipulacion.creaCliente());
                                    System.out.println(Manipulacion.despC(c, c.length));
                                    fC = Manipulacion.buscarClienteF(c.length, c);
                                    nom = Manipulacion.buscarClienteN(c, Manipulacion.buscarCliente(c, fC));

                                }
                                if (opc2 == 2)
                                {
                                    System.out.println("Cual es su folio de cliente?");
                                    fC = Lecturas.leerCadena();
                                    nom = Manipulacion.buscarClienteN(c, Manipulacion.buscarCliente(c, fC));
                                }
                                if (nom != "nul")
                                {
                                    do
                                    {

                                        opc5 = Manipulacion.pintaMenu(mnuC1, "Hola " + nom + " que quieres hacer hoy?");
                                        switch (opc5)
                                        {
                                            case 1:
                                                int statusX = 0;
                                                if (v != null)
                                                {
                                                    statusX = Manipulacion.buscarStatusEspera(v, s, fC);
                                                } else
                                                {
                                                    statusX = 1;
                                                }
                                                switch (statusX)
                                                {
                                                    case -1:
                                                        System.out.println("Ya tienes un viaje en espera");
                                                        break;
                                                    case 1:
                                                        tmpC = Manipulacion.creaViaje(fC, v, s);
                                                        if (tmpC.getStatus() == 'S')
                                                        {
                                                            tmpV = Manipulacion.insertaViaje(s, tmpV, tmpC, 0);
                                                            System.out.println(Manipulacion.despV(tmpV, fC));

                                                        } else
                                                        {
                                                            v = Manipulacion.insertaViaje(s, v, tmpC, Manipulacion.buscarSocioDisponible(v, s, fC));
                                                            System.out.println(Manipulacion.despV(v, fC));
                                                        }
                                                        break;
                                                }

                                                break;
                                            case 2:
                                                if (v != null)
                                                {
                                                    if (tmpC != null)
                                                    {
                                                        if (tmpC.getStatus() == 'S')
                                                        {
                                                            tmpV = Manipulacion.cancelarViaje(s, v, Manipulacion.buscarStatusE(v, s, fC));
                                                            System.out.println(Manipulacion.despVCancelados(tmpV, fC));
                                                        } else
                                                        {
                                                            v = Manipulacion.cancelarViaje(s, v, Manipulacion.buscarStatusE(v, s, fC));
                                                            System.out.println(Manipulacion.despVCancelados(v, fC));
                                                        }

                                                    } else
                                                    {

                                                        v = Manipulacion.cancelarViaje(s, v, Manipulacion.buscarStatusE(v, s, fC));
                                                        System.out.println(Manipulacion.despVCancelados(v, fC));

                                                    }

                                                } else
                                                {
                                                    System.out.println("Aun no se registran viajes viajes");
                                                }

                                                break;
                                            case 3:
                                                if (v != null)
                                                {
                                                    System.out.println(Manipulacion.despVTodosC(v, fC));
                                                    if (tmpV != null)
                                                    {
                                                        System.out.println(Manipulacion.despVTodosC(tmpV, fC));
                                                    }
                                                    
                                                } else
                                                {
                                                    System.out.println("Aun no se registran viajes viajes");
                                                }

                                                break;
                                            case 4:
                                                Manipulacion.consultaGastos(v, fC);
                                                System.out.println();
                                                break;
                                            case 5:
//                                                if (tmpV != null)
//                                                {
//                                                    tmpC = Manipulacion.copiarViaje(tmpV);
//                                                    System.out.println(tmpC);
//                                                    if (tmpC.getStatus() == 'S')
//                                                    {
//
//                                                        v = Manipulacion.insertaViaje(s, tmpV, tmpC, Manipulacion.buscarSocioDisponible(v, s, fC));
//
//                                                    } else
//                                                    {
//                                                        if (tmpC.getStatus() == 'E')
//                                                        {
//                                                            v = Manipulacion.insertaViaje(s, v, tmpC, Manipulacion.buscarSocioDisponible(v, s, fC));
//                                                            System.out.println(Manipulacion.despV(v, fC));
//
//                                                        }
//
//                                                    }
//                                                }

                                                break;
                                            case 6:
                                                System.out.println("Cerrando sesion");
                                                break;
                                            default:
                                                System.out.println("Error....");
                                        }

                                    } while (opc5 != mnuC1.length);
                                    break;

                                }
                                break;

                            case 3:
                                System.out.println("Saleindo....");
                                break;
                            default:
                                System.out.println("Error...");
                        }

                    } while (opc2 != mnuC.length);

                    break;
                case 2:
                    do
                    {
                        opc3 = Manipulacion.pintaMenu(mnuS, "Socios");
                        switch (opc3)
                        {
                            case 1, 2:
                                if (opc3 == 1)
                                {
                                    s = Manipulacion.insertaSocio(s, Manipulacion.creaSocio());
                                    System.out.println(Manipulacion.despS(s, s.length));
                                    nS = Manipulacion.buscarSocioNum(s.length, s);
                                    nomS = Manipulacion.buscarSocioNom(s, Manipulacion.buscarSocio(s, nS));
                                    pos = Integer.parseInt(nS);
                                }
                                if (opc3 == 2)
                                {
                                    System.out.println("Cual es su Numero de socio");
                                    nS = Lecturas.leerCadena();
                                    nomS = Manipulacion.buscarSocioNom(s, Manipulacion.buscarSocio(s, nS));
                                    pos = Integer.parseInt(nS);
                                }
                                if (nomS != "nul")
                                {

                                    do
                                    {
                                        opc4 = Manipulacion.pintaMenu(mnuS1, "Hola de nuevo " + nomS + " que quieres hacer hoy?");
                                        switch (opc4)
                                        {
                                            case 1:
                                                do
                                                {
                                                    opc6 = Manipulacion.pintaMenu(mnuM, "Modificacion de datos");
                                                    switch (opc6)
                                                    {
                                                        case 1:

                                                            System.out.println("cual es la nueva placa?");
                                                            s = Manipulacion.modificaPlaca(pos, s, Lecturas.leerCadena());
                                                            System.out.println(Manipulacion.despS(s, nS));

                                                            break;
                                                        case 2:
                                                            System.out.println("cual es el nuevo modelo?");
                                                            s = Manipulacion.modificaModelo(pos, s, Lecturas.leerCadena());
                                                            System.out.println(Manipulacion.despS(s, nS));
                                                            break;

                                                        default:
                                                            System.out.println("Error...");
                                                    }

                                                } while (opc6 != mnuM.length);
                                                break;
                                            case 2:
                                                v = Manipulacion.iniciarViajeS(s, v, pos);
                                                break;
                                            case 3:
                                                v = Manipulacion.cancelarViajeS(s, v, pos);
                                                break;
                                            case 4:
                                                v = Manipulacion.terminarViajeS(s, v, pos);
                                                break;
                                            case 5:
                                                System.out.println(Manipulacion.despVTodosS(v, pos));
                                                break;
                                            case 6:
                                                Manipulacion.consultaGanancias(v, pos);
                                                break;
                                            case 7:
                                                System.out.println("Cerrando sesion");
                                                break;
                                        }

                                    } while (opc4 != mnuS1.length);
                                    break;

                                }
                                break;
                            case 3:
                                System.out.println("Saliento...");
                                break;
                            default:
                                System.out.println("Error...");
                        }

                    } while (opc3 != mnuS.length);
                    break;
                case 3:
                    System.out.println("Hasta la proximaaa....:D");
                    break;
                default:
                    System.out.println("Error...");
            }

        } while (opc1 != mnu1.length);
        ManipulaArchivos.guardaC(Cliente.getCons(), "foliosC.dat");
        ManipulaArchivos.guardaCA(c, "Clientes.dat");
        ManipulaArchivos.guardaS(Socio.getCons(), "foliosS.dat");
        ManipulaArchivos.guardaSA(s, "Socios.dat");

    }

}