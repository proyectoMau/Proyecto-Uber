/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

import Interfaz.VtnPrincipal;

/**
 *
 * @author ANGEL
 */
public class Manipulacion
{

    static int contS = 0;

    public static int pintaMenu(String mnu[], String tit)
    {
        System.out.println("====== " + tit + "=====");
        for (int i = 0; i < mnu.length; i++)
        {
            System.out.println((i + 1) + ".-" + mnu[i]);
        }
        System.out.println("Elige una opcion: ");
        return Lecturas.leerEntero();
    }//crea el menú

    public static Socio creaSocio()
    {

        String nom;
        String placas;
        String modelo;
        String fecha;

        System.out.print("cual es tu nombre ");
        nom = Lecturas.leerCadena();
        System.out.print("Cuales son sus placas ");
        placas = Lecturas.leerCadena();
        System.out.print("Cual es el modelo ");
        modelo = Lecturas.leerCadena();
        System.out.print("Dame el Fecha ");
        fecha = Lecturas.leerCadena();
        return new Socio(nom, placas, modelo, fecha);

    }
    //crea objeto tipo socio

    public static Cliente creaCliente()
    {

        String nom;
        char formaPago;
        String fecha;
        boolean x = false;

        System.out.print("cual es tu nombre ");
        nom = Lecturas.leerCadena();
        do
        {
            System.out.print("Cual es la forma de pago? (T o E) ");
            formaPago = Lecturas.leerCaracter();
            if (formaPago == 'T' || formaPago == 't')
            {
                x = true;
            } else
            {
                if (formaPago == 'E' || formaPago == 'e')
                {
                    x = true;
                } else
                {
                    System.out.println("Ingresa una forma de pago correcta");
                }
            }
        } while (x != true);

        System.out.print("Dame el Fecha ");
        fecha = Lecturas.leerCadena();
        return new Cliente(nom, formaPago, fecha);

    }

    public static Viaje creaViaje(String folioCliente, Viaje[][] v, Socio[] s)
    {

        String origen;
        String destino;
        char status;
        String fecha;
        double monto;
        int y;

        System.out.print("cual es el origen ");
        origen = Lecturas.leerCadena();
        System.out.print("cual es tu destino ");
        destino = Lecturas.leerCadena();
        System.out.print("Dame el Fecha ");
        fecha = Lecturas.leerCadena();
        monto = (int) (Math.random() * 200);
        System.out.println("El monto a pagar es: " + monto);
        if (s != null)
        {
            y = (int) (Math.random() * s.length);
        } else
        {
            y = 0;
        }
        System.out.println(y);
        status = buscarStatus(v, s, y);
        System.out.println("Status:" + status);
        return new Viaje(folioCliente, origen, destino, status, fecha, monto);

    }

    public static Viaje creaViaje2(String folioCliente, Viaje[][] v, Socio[] s, int y)
    {

        String origen;
        String destino;
        char status;
        String fecha;
        double monto;

        System.out.print("cual es el origen ");
        origen = Lecturas.leerCadena();
        System.out.print("cual es tu destino ");
        destino = Lecturas.leerCadena();
        System.out.print("Dame el Fecha ");
        fecha = Lecturas.leerCadena();
        monto = (double) (Math.random() * 200);
        System.out.println("El monto a pagar es: " + monto);
        System.out.println(y);
        status = buscarStatus(v, s, y);
        System.out.println("Status:" + status);
        return new Viaje(folioCliente, origen, destino, status, fecha, monto);

    }

    public static Socio[] modificaPlaca(int pos, Socio[] s, String placas)
    {
        if (s == null)
        {
            System.out.println("No se encontro socio");
        } else
        {
            if (pos < 0 || pos > s.length)
            {
                System.out.println("No se encontro socio");
            } else
            {
                if (s.length == 1 && pos == 0)
                {
                    s[0].setPlacas(placas);
                } else
                {

                    Socio tmp[] = new Socio[s.length];
                    for (int i = 0; i < s.length; i++)
                    {
                        if (i != pos - 1)
                        {
                            tmp[i] = s[i];

                        } else
                        {
                            tmp[i] = s[i];
                            tmp[i].setPlacas(placas);

                        }

                    }
                    s = tmp;

                }
            }
        }

        {
        }
        return s;
    }

    public static int buscarPlaca(Socio[] s, String numSocio)
    {
        if (s == null)
        {
            return -1;
        } else
        {

            for (int i = 0; i < s.length; i++)
            {
                if (s[i].getNumSocio().equals(numSocio))
                {
                    return i;
                }
            }

        }
        return -1;
    }

    public static Socio[] modificaModelo(int pos, Socio[] s, String modelo)
    {
        if (s == null)
        {
            System.out.println("No se encontro socio");
        } else
        {
            if (pos < 0 || pos > s.length)
            {
                System.out.println("No se encontro socio");
            } else
            {
                if (s.length == 1 && pos == 0)
                {
                    s[0].setModelo(modelo);
                } else
                {

                    Socio tmp[] = new Socio[s.length];
                    for (int i = 0; i < s.length; i++)
                    {
                        if (i != pos - 1)
                        {
                            tmp[i] = s[i];

                        } else
                        {
                            tmp[i] = s[i];
                            tmp[i].setModelo(modelo);

                        }

                    }
                    s = tmp;

                }
            }
        }
        return s;
    }

    public static int buscarModelo(Socio[] s, String modelo)
    {
        if (s == null)
        {
            return -1;
        } else
        {

            for (int i = 0; i < s.length; i++)
            {
                if (s[i].getPlacas().equals(modelo))
                {
                    return i;
                }
            }

        }
        return -1;
    }

    public static int buscarCliente(Cliente[] c, String foli)
    {
        if (c == null)
        {
            return -1;
        } else
        {

            for (int i = 0; i < c.length; i++)
            {
                if (c[i].getFolioCliente().equals(foli))
                {
                    return i;
                }
            }

        }
        return -1;
    }

    public static String buscarClienteF(Cliente[] c, int x)
    {
        String s = " ";
        if (c == null || x < 0 || x > c.length)
        {
            return s;
        } else
        {

            c[x - 1].getFolioCliente();

        }
        return s;
    }

    public static int buscarClienteFolio(Viaje[][] v, String z)
    {
        if (v == null)
        {
            return -1;
        } else
        {
            for (int i = 0; i < v[0].length; i++)
            {
                if (v[0][i].getFolioCliente().equals(z))
                {
                    if (v[0][i].getStatus() == 'S')
                    {
                        return i;

                    }

                }

            }

        }
        return -1;
    }

    public static Viaje copiarViaje(Viaje[][] v, int pos)
    {
        Viaje obj = null;
        if (v == null)
        {
            return null;
        } else
        {

            for (int i = 0; i < v[pos - 1].length; i++)
            {
                if (v[pos - 1][i].getStatus() == 'S' || v[pos - 1][i].getStatus() == 'E')
                {
                    obj = v[pos - 1][i];

                    return obj;

                } else
                {
                    System.out.println("No tienes viajes para cambiar");
                }

            }

        }

        return obj;
    }

    public static Viaje[][] elimina(Viaje[][] v, int x, String fol)
    {
        if (v == null)
        {
            System.out.println("No hay viajes");
            return v;
        } else
        {
            if (x < 0 || x > v.length)
            {
                System.out.println("Posicion incorrecta");
                return v;
            } else
            {

                if (v[x].length == 1)
                {
                    v[x] = null;
                } else
                {

                    Viaje tmp[] = new Viaje[v[x].length - 1];
                    for (int i = 0, j = 0; i < v[x].length - 1; i++)
                    {
                        if (v[x][i].getFolioCliente().equals(fol))
                        {
                        } else
                        {
                            tmp[j++] = v[x][i];
                        }

                    }
                    v[x] = tmp;

                }
            }
        }

        return v;

    }

    public static String buscarClienteN(Cliente[] c, int x)
    {
        String s = "nul";
        if (c == null || x < 0 || x > c.length)
        {
            System.out.println("no se encontro el cliente");
            return s;
        } else
        {
            if (x == 0)
            {
                s = c[x].getNom();
            } else
            {
                s = c[x].getNom();
            }

        }
        return s;
    }

    public static String buscarClienteF(int x, Cliente[] c)
    {
        String s = " ";
        if (c == null || x < 0 || x > c.length)
        {
            return s;
        } else
        {
            s = c[x - 1].getFolioCliente();
        }
        return s;
    }

    public static int buscarSocio(Socio[] s, String num)
    {
        if (s == null)
        {
            return -1;
        } else
        {

            for (int i = 0; i < s.length; i++)
            {
                if (s[i].getNumSocio().equals(num))
                {
                    return i;
                }
            }

        }
        return -1;
    }

    public static String buscarSocioNum(int x, Socio[] s)
    {
        String a = " ";
        if (s == null || x < 0 || x > s.length)
        {
            return a;
        } else
        {
            a = s[x - 1].getNumSocio();
        }
        return a;
    }

    public static String buscarSocioNom(Socio[] c, int x)
    {
        String s = "nul";
        if (c == null || x < 0 || x > c.length)
        {
            return s;
        } else
        {
            if (x == 0)
            {
                s = c[x].getNom();
            } else
            {
                s = c[x].getNom();
            }

        }
        return s;
    }

    public static Socio[] insertaSocio(Socio[] s, Socio obj)
    {
        if (s == null)
        {
            s = new Socio[1];
            s[0] = obj;
            return s;

        } else
        {
            Socio[] tmp = new Socio[s.length + 1];
            System.arraycopy(s, 0, tmp, 0, s.length);
            tmp[s.length] = obj;
            return tmp;
        }
    }

    public static Cliente[] insertaCliente(Cliente[] c, Cliente obj)
    {
        if (c == null)
        {
            c = new Cliente[1];
            c[0] = obj;
            return c;

        } else
        {
            Cliente[] tmp = new Cliente[c.length + 1];
            System.arraycopy(c, 0, tmp, 0, c.length);
            tmp[c.length] = obj;
            return tmp;
        }
    }

    public static int buscarSocioDisponible(Viaje[][] v, Socio[] s, String folioClien)
    {
        if (s == null)
        {
            return -1;
        } else
        {
            if (v == null)
            {
                return 0;
            } else
            {

                for (int i = 0; i < v.length; i++)
                {
                    if (v[i] == null)
                    {
                        return i;

                    } else
                    {
                        for (int j = 0; j < v[i].length; j++)
                        {

                            if ('C' == v[i][j].getStatus() || 'T' == v[i][j].getStatus() || 'I' == v[i][j].getStatus())
                            {
                                return i;
                            }

                        }
                    }
                }
            }
        }
        return -1;
    }

    public static char buscarStatus(Viaje[][] v, Socio[] s, int x)
    {
        if (s == null)
        {
            return 'S';
        } else
        {
            if (v == null)
            {
                return 'E';

            } else
            {

                if (v[x] == null)
                {
                    return 'E';

                }
                for (int j = 0; j < v[x].length; j++)
                {
                    if ('C' == v[x][j].getStatus() || 'T' == v[x][j].getStatus() || 'I' == v[x][j].getStatus())
                    {
                        return 'E';
                    }

                }

            }

        }
        return 'S';
    }

    public static Viaje[][] insertaViaje(Socio[] s, Viaje[][] v, Viaje obj, int x)
    {
        System.out.println(obj+" nuevo ");
        if (s == null)
        {
            System.out.println("aun no hay socios disponibles");
            return v;

        } else
        {
            if (v == null)
            {
                v = new Viaje[s.length][];
                v[x] = new Viaje[1];
                v[x][0] = obj;

            } else
            {
                if (s.length != v.length)
                {
                    Viaje[][] tmp = new Viaje[s.length][];
                    for (int i = 0; i < v.length; i++)
                    {
                        tmp[i] = v[i];
                    }

                    v = tmp;

                }

                if (v[x] == null)
                {
                    v[x] = new Viaje[1];
                    v[x][0] = obj;
                } else
                {
                    Viaje tmp[] = new Viaje[v[x].length + 1];
                    System.arraycopy(v[x], 0, tmp, 0, v[x].length);
                    tmp[v[x].length] = obj;
                    v[x] = tmp;

                }
            }
        }

        return v;

    }

    public static Viaje[][] insertaSocioViajes(Socio[] s, Viaje[][] v)
    {
        if (s == null)
        {
            System.out.println("aun no hay socios disponibles");
            return v;

        } else
        {
            if (v == null)
            {
                v = new Viaje[s.length][];
            } else
            {
                if (s.length != v.length)
                {
                    Viaje[][] tmp = new Viaje[s.length][];
                    for (int i = 0; i < v.length; i++)
                    {
                        tmp[i] = v[i];
                    }

                    v = tmp;

                }
            }
        }

        return v;

    }

    public static Viaje[][] insertaViajeC(Cliente[] c, Viaje[][] v, Viaje obj, int x)
    {
        if (c == null)
        {
            System.out.println("aun no hay socios disponibles");
            return v;

        } else
        {
            if (v == null)
            {
                v = new Viaje[c.length][];
                v[x - 1] = new Viaje[1];
                v[x - 1][0] = obj;

            } else
            {
                if (c.length != v.length)
                {
                    Viaje[][] tmp = new Viaje[c.length][];
                    for (int i = 0; i < v.length; i++)
                    {
                        tmp[i] = v[i];
                    }

                    v = tmp;

                }

                if (v[x - 1] == null)
                {
                    v[x - 1] = new Viaje[1];
                    v[x - 1][0] = obj;
                } else
                {
                    Viaje tmp[] = new Viaje[v[x - 1].length + 1];
                    System.arraycopy(v[x - 1], 0, tmp, 0, v[x - 1].length);
                    tmp[v[x - 1].length] = obj;
                    v[x - 1] = tmp;

                }
            }
        }

        return v;

    }

    public static int buscarStatusE(Viaje[][] v, Socio[] s, String FolioCliente)
    {
        if (v == null)
        {
            return -1;
        } else
        {

            for (int i = 0; i < v.length; i++)
            {
                if (v[i] != null)
                {
                    for (int j = 0; j < v[i].length; j++)
                    {
                        if ('E' == v[i][j].getStatus() || v[i][j].getStatus() == 'S')
                        {
                            if (v[i][j].getFolioCliente().equals(FolioCliente))
                            {
                                return i;
                            }

                        }

                    }

                }

            }

        }
        return -1;
    }

    public static int buscarStatusEspera(Viaje[][] v, Socio[] s, String FolioCliente)
    {
        if (v == null)
        {
            return 1;
        } else
        {

            for (int i = 0; i < v.length; i++)
            {
                if (v[i] != null)
                {
                    for (int j = 0; j < v[i].length; j++)
                    {
                        if ('E' == v[i][j].getStatus() || v[i][j].getStatus() == 'S')
                        {
                            if (v[i][j].getFolioCliente().equals(FolioCliente))
                            {
                                return -1;
                            }

                        }

                    }

                }

            }

        }
        return 1;
    }

    public static int buscarStatusEspera2(Viaje[][] v, Socio[] s, String FolioCliente)
    {
        if (s == null || v == null)
        {
            return -1;
        } else
        {

            for (int i = 0; i < v.length; i++)
            {
                if (v[i] != null)
                {
                    for (int j = 0; j < v[i].length; j++)
                    {
                        if ('E' == v[i][j].getStatus() || v[i][j].getStatus() == 'S')
                        {
                            if (v[i][j].getFolioCliente().equals(FolioCliente))
                            {
                                return i;
                            }

                        }

                    }

                }

            }

        }
        return -1;
    }

    public static int buscarStatusEspera3(Viaje[][] v, Socio[] s, String FolioCliente)
    {
        if (s == null || v == null)
        {
            return -1;
        } else
        {

            for (int i = 0; i < v.length; i++)
            {
                if (v[i] != null)
                {
                    for (int j = 0; j < v[i].length; j++)
                    {
                        if ('E' == v[i][j].getStatus() || v[i][j].getStatus() == 'S')
                        {
                            if (v[i][j].getFolioCliente().equals(FolioCliente))
                            {
                                return j;
                            }

                        }

                    }

                }

            }

        }
        return -1;
    }

    public static Viaje[][] cancelarViaje(Socio[] s, Viaje[][] v, int x)
    {
        int y = 0;
        if (v == null || x < 0 || x > v.length)
        {
            System.out.println("Viaje no encontrado");
        } else
        {
            if (v[x] == null)
            {
                System.out.println("Viaje no encontrado");
            } else
            {
                for (int j = 0; j < v[x].length; j++)
                {

                    if (v[x][j].getStatus() == 'E' || v[x][j].getStatus() == 'S')
                    {
                        v[x][j].setStatus('C');
                        y = 1;
                    }
                }
                if (y == 0)
                {
                    System.out.println("Aun no hay viaje nuevo");
                }
            }
        }
        return v;
    }

    public static Viaje[][] cancelarViajeC(Cliente[] c, Viaje[][] v, int x)
    {
        int y = 0;
        if (v == null || c == null || x < 0 || x > v.length)
        {
            System.out.println("Viaje no encontrado");
        } else
        {
            if (v[x - 1] == null)
            {
                System.out.println("Viaje no encontrado");
            } else
            {
                for (int j = 0; j < v[x - 1].length; j++)
                {

                    if (v[x - 1][j].getStatus() == 'E' || v[x - 1][j].getStatus() == 'S')
                    {
                        v[x - 1][j].setStatus('C');
                        y = 1;
                        return v;
                    }

                }
                if (y == 0)
                {
                    System.out.println("Aun no hay viaje nuevo");
                    System.out.println(y);
                }

            }
        }
        return v;
    }

    public static Viaje[][] cancelarViajeS(Socio[] s, Viaje[][] v, int x)
    {
        int y = 0;
        if (v == null || s == null || x < 0 || x > v.length)
        {
            System.out.println("Viaje no encontrado");
        } else
        {
            if (v[x - 1] == null)
            {
                System.out.println("Viaje no encontrado");
            } else
            {
                for (int j = 0; j < v[x - 1].length; j++)
                {
                    if (v[x - 1][j].getStatus() == 'E' || v[x - 1][j].getStatus() == 'S')
                    {
                        v[x - 1][j].setStatus('C');
                        System.out.println("Viaje cancelado");
                        y = 1;
                    }
                }
                if (y == 0)
                {
                    System.out.println("No hay viaje por cancelar");
                }
            }
        }
        return v;
    }

    public static Viaje[][] iniciarViajeS(Socio[] s, Viaje[][] v, int x)
    {
        int y = 0;
        if (v == null || s == null || x < 0 || x > v.length)
        {
            System.out.println("Viaje no encontrado");
        } else
        {
            if (v[x - 1] == null)
            {
                System.out.println("No tienes viajes asignados aun");
            } else
            {
                for (int j = 0; j < v[x - 1].length; j++)
                {
                    if (v[x - 1][j].getStatus() == 'E')
                    {
                        v[x - 1][j].setStatus('I');
                        System.out.println("Viaje iniciado");
                        y = 1;
                    }
                }
                if (y == 0)
                {
                    System.out.println("No hay viaje por Iniciar");
                }
            }
        }
        return v;
    }

    public static Viaje[][] terminarViajeS(Socio[] s, Viaje[][] v, int x)
    {
        int y = 0;
        if (v == null || s == null || x < 0 || x > v.length)
        {
            System.out.println("Viaje no encontrado");
        } else
        {
            if (v[x - 1] == null)
            {
                System.out.println("Viaje no encontrado");
            } else
            {
                for (int j = 0; j < v[x - 1].length; j++)
                {
                    if (v[x - 1][j].getStatus() == 'I')
                    {
                        v[x - 1][j].setStatus('T');
                        System.out.println("Viaje terminado");
                        y = 1;
                    }
                }
                if (y == 0)
                {
                    System.out.println("No hay viaje por cancelar");
                }
            }
        }
        return v;
    }

    public static String consultaGanancias(Viaje[][] v, int x)
    {
        String s = " ";
        double y = 0;
        if (v == null || x < 0 || x > v.length)
        {
            s = "Sin Viajes ";
        } else
        {
            if (v[x - 1] == null)
            {
                s = "Sin Viajes ";
            } else
            {
                for (int j = 0; j < v[x - 1].length; j++)
                {
                    if (v[x - 1][j].getStatus() == 'T')
                    {
                        y = y + v[x - 1][j].getMonto();
                    }
                }
                if (y == 0)
                {
                    s = "Aun no tienes ganancias";
                } else
                {
                    s = "Su total de ganancias: " + y;
                }

            }
        }
        return s;
    }

    public static String consultaGastos(Viaje[][] v, String folio)
    {
        String s = " ";
        double y = 0;
        if (v == null)
        {
            s = "Sin Viajes";
        } else
        {

            for (int i = 0; i < v.length; i++)
            {
                if (v[i] == null)
                {
                    s = "Sin Viajes";
                } else
                {
                    for (int j = 0; j < v[i].length; j++)
                    {
                        if (v[i][j].getFolioCliente().equals(folio))
                        {
                            if (v[i][j].getStatus() == 'T')
                            {
                                y = y + v[i][j].getMonto();
                            }

                        }

                    }

                }
            }
            if (y == 0)
            {
                s = "Aun no tienes gastos";
            } else
            {
                s = "Su total de gastos es: " + y;
            }
        }
        return s;
    }

    public static String despC(Cliente[] c, int pos)
    {
        String s = "";
        if (c != null)
        {

            s += c[pos - 1].toString();

        } else
        {
            s = "no hay datos";
        }
        return s;

    }

    public static String despS(Socio[] s, int pos)//V[][],c[]
    {
        String c = "";
        if (s != null)
        {
            c += s[pos - 1].toString();
        } else
        {
            c = "no hay datos";
        }
        return c;

    }
    public static String despS2(Socio[] s, int pos)//V[][],c[]
    {
        String c = "";
        if (s != null)
        {
            System.out.println(pos+"socio");
            c += s[pos].toString();
        } else
        {
            c = "no hay datos";
        }
        return c;

    }

    public static String despSInt(Socio[] s, int pos)
    {
        String c = "";
        if (s != null)
        {
            System.out.println(pos);
            if (pos >= 0)
            {
                c += s[pos].toString();
            }

        } else
        {
            c = "no hay datos";
        }
        return c;

    }

    public static String despS(Socio[] s, String pos)
    {
        String c = "";
        if (s != null)
        {
            for (int i = 0; i < s.length; i++)
            {
                if (s[i].getNumSocio().equals(pos))
                {
                    c += s[i].toString();
                    return c;

                }

            }

        } else
        {
            c = "no hay datos";
        }
        return c;

    }

    public static String despV(Viaje[][] v, String pos)
    {
        String s = "";
        if (v != null)
        {
            for (int i = 0; i < v.length; i++)
            {
                if (v[i] != null)
                {
                    for (int j = 0; j < v[i].length; j++)
                    {
                        if (v[i][j].getFolioCliente().equals(pos))
                        {
                            if (v[i][j].getStatus() == 'E')
                            {
                                s += v[i][j].toString();
                            } else
                            {
                                if (v[i][j].getStatus() == 'S')
                                {
                                    s += v[i][j].toString();
                                }
                            }

                        }

                    }

                }

            }

        } else
        {
            s = "no hay datos";
        }
        return s;

    }

    public static String despVCancelados(Viaje[][] v, String pos)
    {
        String s = "";
        if (v != null)
        {
            for (int i = 0; i < v.length; i++)
            {
                if (v[i] != null)
                {
                    for (int j = 0; j < v[i].length; j++)
                    {
                        if (v[i][j].getFolioCliente().equals(pos))
                        {
                            if (v[i][j].getStatus() == 'C')
                            {
                                s += v[i][j].toString();
                            }

                        }

                    }

                }

            }

        } else
        {
            s = "no hay datos";
        }
        return s;

    }

    public static String despVTodosC(Viaje[][] v, String pos)
    {
        String s = "";
        if (v != null)
        {
            for (int i = 0; i < v.length; i++)
            {
                if (v[i] != null)
                {
                    for (int j = 0; j < v[i].length; j++)
                    {
                        if (v[i][j].getFolioCliente().equals(pos))
                        {

                            s += v[i][j].toString() + "\n";

                        }

                    }

                }

            }

        } else
        {
            s = "no hay datos";
        }
        return s;

    }

    public static String despVTodosCS(Viaje[][] v, String pos, Socio [] so)
    {
        String s = "";
        int g=0;
        if (v != null)
        {
            for (int i = 0; i < v.length; i++)
            {
                
                if (v[i] != null)
                {
                    for (int j = 0; j < v[i].length; j++)
                    {
                        
                        if (v[i][j].getFolioCliente().equals(pos))
                        {
                            System.out.println(g+"viaje");

                            s += v[i][j].toString() + "\n";
                            

                        }

                    }
                    

                }

            }

        } else
        {
            s = "no hay datos";
        }
        return s;

    }

    public static String despVTodosC2(Viaje[][] v, int pos)
    {
        String s = "";
        if (v != null)
        {

            if (v[pos] != null)
            {
                for (int j = 0; j < v[pos].length; j++)
                {

                    s += v[pos][j].toString() + "\n";

                }

            }

        } else
        {
            s = "no hay datos";
        }
        return s;

    }

    public static String despV2(Viaje[][] v, int x)
    {
        String s = "";
        if (v != null)
        {

            if (v[x - 1] != null)
            {
                for (int j = 0; j < v[x - 1].length; j++)
                {
                    if (v[x - 1][j].getStatus() == 'C')
                    {
                        s += v[x - 1][j].toString();
                    }

                }

            }

        } else
        {
            s = "no hay Viajes";
        }
        return s;

    }

    public static String despV3(Viaje[][] v, int x)
    {
        int y = 0;
        String s = "";
        if (v != null)
        {

            if (v[x - 1] != null)
            {
                for (int j = 0; j < v[x - 1].length; j++)
                {
                    if (v[x - 1][j].getStatus() == 'I')
                    {
                        s += v[x - 1][j].toString();
                        y = 1;
                    }

                }
                if (y == 0)
                {
                    s = "Aun no hay viaje en espera";
                }

            }

        } else
        {
            s = "no hay Viajes";
        }
        return s;

    }

    public static String despVTodosS(Viaje[][] v, int x)
    {
        String s = "";
        if (v != null)
        {

            if (v[x - 1] != null)
            {
                for (int j = 0; j < v[x - 1].length; j++)
                {

                    s += v[x - 1][j].toString() + "\n";

                }

            }

        } else
        {
            s = "no hay datos";
        }
        return s;

    }

}
