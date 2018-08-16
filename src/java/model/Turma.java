package model;

public class Turma {
    private String cod_disc;
    private String cod;
    private String dh;
    private String nome_disc;
    private String ch;



    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getDh() {
        return dh;
    }

    public void setDh(String dh) {
        this.dh = dh;
    }

    public String getCod_disc() {
        return cod_disc;
    }

    public void setCod_disc(String cod_disc) {
        this.cod_disc = cod_disc;
    }

    public String getNome_disc() {
        return nome_disc;
    }

    public void setNome_disc(String nome_disc) {
        this.nome_disc = nome_disc;
    }

    public String getCh() {
        return ch;
    }

    public void setCh(String ch) {
        this.ch = ch;
    }
    
    public String getHorario(){
        String rst = "";
        String[] hrs = this.dh.split(";");
            for(int i =0;i< hrs.length; i++){
                switch(hrs[i]){
                    case "2T56":
                        rst+= "SEG 17-19<br/>";
                            break;
                    case "4T12":
                        rst+="QUA 13-15<br/>";
                            break;
                    case "3T56":
                        rst+="TER 17-19<br/>";
                            break;
                    case "5T34":
                        rst+="QUI 15-17<br/>";
                            break;
                    case "24T56":
                        rst+="SEG 17-19 <br/>QUA 17-19";
                            break;
                    case "46T12":
                        rst+="QUA 13-15 <br/>SEX 13-15";
                            break;
                     case "2T34":
                        rst+="SEG 15-17<br/>";
                            break;
                     case "23T12":
                        rst+="SEG 13-15 <br/>TER 13-15";
                            break;
                }
            }
        return rst;
    }
    
}
