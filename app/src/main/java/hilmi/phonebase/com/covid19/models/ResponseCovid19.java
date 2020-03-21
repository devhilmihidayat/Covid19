package hilmi.phonebase.com.covid19.models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by User on 21/03/2020.
 */
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class ResponseCovid19{

    @SerializedName("meninggal")
    private String meninggal;

    @SerializedName("positif")
    private String positif;

    @SerializedName("sembuh")
    private String sembuh;

//    @SerializedName("name")
//    private String name;

    public void setMeninggal(String meninggal){
        this.meninggal = meninggal;
    }

    public String getMeninggal(){
        return meninggal;
    }

    public void setPositif(String positif){
        this.positif = positif;
    }

    public String getPositif(){
        return positif;
    }

    public void setSembuh(String sembuh){
        this.sembuh = sembuh;
    }

    public String getSembuh(){
        return sembuh;
    }

//    public void setName(String name){
//        this.name = name;
//    }
//
//    public String getName(){
//        return name;
//    }

    @Override
    public String toString(){
        return
                "ResponseCovid19{" +
                        "meninggal = '" + meninggal + '\'' +
                        ",positif = '" + positif + '\'' +
                        ",sembuh = '" + sembuh + '\'' +
//                        ",name = '" + name + '\'' +
                        "}";
    }
}