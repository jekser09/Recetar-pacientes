/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author johand
 */
public class MedicamentoFormula {    
    private String cedula;
    private String medicamento;

    public MedicamentoFormula(String cedula, String medicamento) {
        this.cedula = cedula;
        this.medicamento = medicamento;
    }

    public MedicamentoFormula() {
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(String medicamento) {
        this.medicamento = medicamento;
    }

    
    
    public String datoFormulaMedicamento(){
        return cedula+","+medicamento;
    }
}
