/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ANGEL
 */
public class ManipulaArchivos
{
    public static void guardaC(Object obj, String cad) 
    {
        try
        {
            FileOutputStream fos = new FileOutputStream("datosC/" + cad);
            try
            {
                ObjectOutputStream arch = new ObjectOutputStream(fos);
                arch.writeObject(obj);
                arch.close();
            } catch (IOException ex)
            {
                System.out.println("Error en la salida de datos...");
            }
        } catch (FileNotFoundException ex)
        {
            System.out.println("Archivo no encontrado " + cad);
        }
    }

    public static void guardaCA(Object[] obj, String cad) 
    {
        try
        {
            FileOutputStream fos = new FileOutputStream("datosC/" + cad);
            try
            {
                ObjectOutputStream arch = new ObjectOutputStream(fos);
                arch.writeObject(obj);
                arch.close();
            } catch (IOException ex)
            {
                System.out.println("Error en la salida de datos...");
            }
        } catch (FileNotFoundException ex)
        {
            System.out.println("Archivo no encontrado " + cad);
        }
    }

    public static Object cargaC(String cad)
    {
        Object obj = null;
        try
        {
            FileInputStream fis = new FileInputStream("datosC/" + cad);
            try
            {
                ObjectInputStream arch = new ObjectInputStream(fis);
                try
                {
                    obj = arch.readObject();
                    arch.close();
                } catch (ClassNotFoundException ex)
                {
                    System.out.println("No coinciden las clases...");
                }
            } catch (IOException ex)
            {
                System.out.println("No se puede leer del archivo...");
            }
        } catch (FileNotFoundException ex)
        {
            System.out.println("Archivo no encontrado " + cad);
        }
        return obj;
    }

    public static Object cargaAC(String cad)
    {
        Object obj[] = null;
        try
        {
            FileInputStream fis = new FileInputStream("datosC/" + cad);
            try
            {
                ObjectInputStream arch = new ObjectInputStream(fis);
                try
                {
                    obj = (Object[]) arch.readObject();
                    arch.close();
                } catch (ClassNotFoundException ex)
                {
                    System.out.println("No coinciden las clases...");
                }
            } catch (IOException ex)
            {
                System.out.println("No se puede leer del archivo...");
            }
        } catch (FileNotFoundException ex)
        {
            System.out.println("Archivo no encontrado " + cad);
        }
        return obj;
    }
    public static void guardaV(Object obj, String cad) 
    {
        try
        {
            FileOutputStream fos = new FileOutputStream("datosV/" + cad);
            try
            {
                ObjectOutputStream arch = new ObjectOutputStream(fos);
                arch.writeObject(obj);
                arch.close();
            } catch (IOException ex)
            {
                System.out.println("Error en la salida de datos...");
            }
        } catch (FileNotFoundException ex)
        {
            System.out.println("Archivo no encontrado " + cad);
        }
    }

    public static void guardaVA(Object[] obj, String cad) 
    {
        try
        {
            FileOutputStream fos = new FileOutputStream("datosV/" + cad);
            try
            {
                ObjectOutputStream arch = new ObjectOutputStream(fos);
                arch.writeObject(obj);
                arch.close();
            } catch (IOException ex)
            {
                System.out.println("Error en la salida de datos...");
            }
        } catch (FileNotFoundException ex)
        {
            System.out.println("Archivo no encontrado " + cad);
        }
    }

    public static Object cargaV(String cad)
    {
        Object obj = null;
        try
        {
            FileInputStream fis = new FileInputStream("datosV/" + cad);
            try
            {
                ObjectInputStream arch = new ObjectInputStream(fis);
                try
                {
                    obj = arch.readObject();
                    arch.close();
                } catch (ClassNotFoundException ex)
                {
                    System.out.println("No coinciden las clases...");
                }
            } catch (IOException ex)
            {
                System.out.println("No se puede leer del archivo...");
            }
        } catch (FileNotFoundException ex)
        {
            System.out.println("Archivo no encontrado " + cad);
        }
        return obj;
    }

    public static Object cargaAV(String cad)
    {
        Object obj[] = null;
        try
        {
            FileInputStream fis = new FileInputStream("datosV/" + cad);
            try
            {
                ObjectInputStream arch = new ObjectInputStream(fis);
                try
                {
                    obj = (Object[]) arch.readObject();
                    arch.close();
                } catch (ClassNotFoundException ex)
                {
                    System.out.println("No coinciden las clases...");
                }
            } catch (IOException ex)
            {
                System.out.println("No se puede leer del archivo...");
            }
        } catch (FileNotFoundException ex)
        {
            System.out.println("Archivo no encontrado " + cad);
        }
        return obj;
    }
    public static void guardaVC(Object obj, String cad) 
    {
        try
        {
            FileOutputStream fos = new FileOutputStream("datosV/" + cad);
            try
            {
                ObjectOutputStream arch = new ObjectOutputStream(fos);
                arch.writeObject(obj);
                arch.close();
            } catch (IOException ex)
            {
                System.out.println("Error en la salida de datos...");
            }
        } catch (FileNotFoundException ex)
        {
            System.out.println("Archivo no encontrado " + cad);
        }
    }

    public static void guardaVAC(Object[] obj, String cad) 
    {
        try
        {
            FileOutputStream fos = new FileOutputStream("datosV/" + cad);
            try
            {
                ObjectOutputStream arch = new ObjectOutputStream(fos);
                arch.writeObject(obj);
                arch.close();
            } catch (IOException ex)
            {
                System.out.println("Error en la salida de datos...");
            }
        } catch (FileNotFoundException ex)
        {
            System.out.println("Archivo no encontrado " + cad);
        }
    }

    public static Object cargaVC(String cad)
    {
        Object obj = null;
        try
        {
            FileInputStream fis = new FileInputStream("datosV/" + cad);
            try
            {
                ObjectInputStream arch = new ObjectInputStream(fis);
                try
                {
                    obj = arch.readObject();
                    arch.close();
                } catch (ClassNotFoundException ex)
                {
                    System.out.println("No coinciden las clases...");
                }
            } catch (IOException ex)
            {
                System.out.println("No se puede leer del archivo...");
            }
        } catch (FileNotFoundException ex)
        {
            System.out.println("Archivo no encontrado " + cad);
        }
        return obj;
    }

    public static Object cargaAVC(String cad)
    {
        Object obj[] = null;
        try
        {
            FileInputStream fis = new FileInputStream("datosV/" + cad);
            try
            {
                ObjectInputStream arch = new ObjectInputStream(fis);
                try
                {
                    obj = (Object[]) arch.readObject();
                    arch.close();
                } catch (ClassNotFoundException ex)
                {
                    System.out.println("No coinciden las clases...");
                }
            } catch (IOException ex)
            {
                System.out.println("No se puede leer del archivo...");
            }
        } catch (FileNotFoundException ex)
        {
            System.out.println("Archivo no encontrado " + cad);
        }
        return obj;
    }
    public static void guardaS(Object obj, String cad) 
    {
        try
        {
            FileOutputStream fos = new FileOutputStream("datosS/" + cad);
            try
            {
                ObjectOutputStream arch = new ObjectOutputStream(fos);
                arch.writeObject(obj);
                arch.close();
            } catch (IOException ex)
            {
                System.out.println("Error en la salida de datos...");
            }
        } catch (FileNotFoundException ex)
        {
            System.out.println("Archivo no encontrado " + cad);
        }
    }

    public static void guardaSA(Object[] obj, String cad) 
    {
        try
        {
            FileOutputStream fos = new FileOutputStream("datosS/" + cad);
            try
            {
                ObjectOutputStream arch = new ObjectOutputStream(fos);
                arch.writeObject(obj);
                arch.close();
            } catch (IOException ex)
            {
                System.out.println("Error en la salida de datos...");
            }
        } catch (FileNotFoundException ex)
        {
            System.out.println("Archivo no encontrado " + cad);
        }
    }

    public static Object cargaS(String cad)
    {
        Object obj = null;
        try
        {
            FileInputStream fis = new FileInputStream("datosS/" + cad);
            try
            {
                ObjectInputStream arch = new ObjectInputStream(fis);
                try
                {
                    obj = arch.readObject();
                    arch.close();
                } catch (ClassNotFoundException ex)
                {
                    System.out.println("No coinciden las clases...");
                }
            } catch (IOException ex)
            {
                System.out.println("No se puede leer del archivo...");
            }
        } catch (FileNotFoundException ex)
        {
            System.out.println("Archivo no encontrado " + cad);
        }
        return obj;
    }

    public static Object cargaAS(String cad)
    {
        Object obj[] = null;
        try
        {
            FileInputStream fis = new FileInputStream("datosS/" + cad);
            try
            {
                ObjectInputStream arch = new ObjectInputStream(fis);
                try
                {
                    obj = (Object[]) arch.readObject();
                    arch.close();
                } catch (ClassNotFoundException ex)
                {
                    System.out.println("No coinciden las clases...");
                }
            } catch (IOException ex)
            {
                System.out.println("No se puede leer del archivo...");
            }
        } catch (FileNotFoundException ex)
        {
            System.out.println("Archivo no encontrado " + cad);
        }
        return obj;
    }
    
}
