package entity;
// Generated 19 mai 2017 15:58:01 by Hibernate Tools 4.3.1



/**
 * Migrations generated by hbm2java
 */
public class Migrations  implements java.io.Serializable {


     private Integer id;
     private String migration;
     private int batch;

    public Migrations() {
    }

    public Migrations(String migration, int batch) {
       this.migration = migration;
       this.batch = batch;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getMigration() {
        return this.migration;
    }
    
    public void setMigration(String migration) {
        this.migration = migration;
    }
    public int getBatch() {
        return this.batch;
    }
    
    public void setBatch(int batch) {
        this.batch = batch;
    }




}


