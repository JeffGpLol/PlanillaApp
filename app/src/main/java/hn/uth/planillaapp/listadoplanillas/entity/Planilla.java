package hn.uth.planillaapp.listadoplanillas.entity;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "planilla_table")
public class Planilla {

    @PrimaryKey(autoGenerate = true)
    @NonNull
    @ColumnInfo(name = "id")
    private Integer idPlanilla;
    @NonNull
    @ColumnInfo(name = "concepto")
    private String concepto;
    @NonNull
    @ColumnInfo(name = "fecha")
    private String fecha;
    @NonNull
    @ColumnInfo(name = "totals")
    private String totals;

    public Planilla(@NonNull String concepto, @NonNull String fecha, @NonNull String totals) {
        this.concepto = concepto;
        this.fecha = fecha;
        this.totals = totals;
    }

    @NonNull
    public Integer getIdPlanilla() {
        return idPlanilla;
    }

    public void setIdPlanilla(@NonNull Integer idVehiculo) {
        this.idPlanilla = idVehiculo;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTotals() {
        return totals;
    }

    public void setTotals(String totals) {
        this.totals = totals;
    }
}
