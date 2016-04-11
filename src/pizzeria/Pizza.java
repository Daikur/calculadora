package pizzeria;

import java.util.List;

public class Pizza {

    private String masa, tipo, tamaño;
    private List<String> ingredientes;
    private final double masaNormal = 9.0;
    private final double masaIntegral = 9.5;
    private final double tipoBasica = 3.0;
    private final double tipoCuatroQuesos = 5.0;
    private final double tipoBarbacoa = 7.0;
    private final double tipoMexicana = 8.5;
    private final double ingJamon = 0.5;
    private final double ingQueso = 0.75;
    private final double ingTomate = 1.5;
    private final double ingCebolla = 2.5;
    private final double ingOlivas = 1.0;
    private final double tamMediana = 1.15;
    private final double tamFamiliar = 1.3;
    private double precioFinal = 0.0;

    public Pizza(String masa, String tipo, String tamaño, List ingredientes) {
        this.masa = masa;
        this.tipo = tipo;
        this.tamaño = tamaño;
        this.ingredientes = ingredientes;
    }

    public String getMasa() {
        return masa;
    }

    public void setMasa(String masa) {
        this.masa = masa;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public List getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(List ingredientes) {
        this.ingredientes = ingredientes;
    }

    public Double calcularPrecio() {
        if (masa.equalsIgnoreCase("Normal")) {
            precioFinal = this.masaNormal;
        } else {
            precioFinal = this.masaIntegral;
        }

        if (tipo.equalsIgnoreCase("Básica")) {
            precioFinal += tipoBasica;
        } else if (tipo.equalsIgnoreCase("4 quesos")) {
            precioFinal += tipoCuatroQuesos;
        } else if (tipo.equalsIgnoreCase("Barbacoa")) {
            precioFinal += tipoBarbacoa;
        } else if (tipo.equalsIgnoreCase("Mexicana")) {
            precioFinal += tipoMexicana;
        }

        for (String i : ingredientes) {
            if (i.equalsIgnoreCase("jamón")) {
                precioFinal += ingJamon;

            }
            if (i.equalsIgnoreCase("queso")) {
                precioFinal += ingQueso;

            }
            if (i.equalsIgnoreCase("tomate")) {
                precioFinal += ingTomate;

            }
            if (i.equalsIgnoreCase("cebolla")) {
                precioFinal += ingCebolla;

            }
            if (i.equalsIgnoreCase("olivas")) {
                precioFinal += ingOlivas;

            }
        }
        if (tamaño.equalsIgnoreCase("Mediana")) {
            precioFinal += tamMediana;
        }
        if (tamaño.equalsIgnoreCase("Familiar")) {
            precioFinal += tamFamiliar;
        }

        return precioFinal;
    }
}
