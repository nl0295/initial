package hello;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;

@Repository
@Transactional
public class PAPDaoImpl implements PAPDao {

    //Méthode pour ajouter un PAP à la base de donnée
    public int ajouterPAP(PAP pap) throws IOException {
        PAP_BDD papBDD=new PAP_BDD(pap);
        ObjectMapper mapper =new ObjectMapper();
        String date=""+(pap.getDatePAP().getYear()+1900)+"-"+(pap.getDatePAP().getMonth()+1)+"-"+(pap.getDatePAP().getDate());

        System.out.println(pap.getPointRisqueRoutier1());

        StringURL url = new StringURL("http://82.223.14.220/ewp2486/ajouterPAP.php?date="+date
                +"&pointFort1="+pap.getPointFort1()+"&pointFort2="+pap.getPointFort2()+"&pointFort3="+pap.getPointFort3()
                +"&pointFaible1="+pap.getPointFaible1()+"&pointFaible2="+pap.getPointFaible2()+"&pointFaible3="+pap.getPointFaible3());

        System.out.println(url.getString());
        int idPAP=mapper.readValue(new URL(url.getString()),Integer.class);

        for(Reunion r : papBDD.getRisque()){
            String dateReunion="";
            if (r.getDate()!=null) dateReunion=""+(r.getDate().getYear()+1900)+"-"+(r.getDate().getMonth()+1)+"-"+(r.getDate().getDate());
            StringURL urlReunion = new StringURL("http://82.223.14.220/ewp2486/ajouterReunion.php?date="+dateReunion
                    +"&titre="+r.getTitre()+"&theme=risque"+"&idPAP="+idPAP);

            mapper.readValue(new URL(urlReunion.getString()),boolean.class);
        }

        for(Reunion r : papBDD.getMre()){
            String dateReunion="";
            if (r.getDate()!=null) dateReunion=""+(r.getDate().getYear()+1900)+"-"+(r.getDate().getMonth()+1)+"-"+(r.getDate().getDate());
            StringURL urlReunion = new StringURL("http://82.223.14.220/ewp2486/ajouterReunion.php?date="+dateReunion
                    +"&titre="+r.getTitre()+"&theme=mre"+"&idPAP="+idPAP);

            mapper.readValue(new URL(urlReunion.getString()),boolean.class);
        }

        for(Reunion r : papBDD.getRisqueRoutier()){
            String dateReunion="";
            if (r.getDate()!=null) dateReunion=""+(r.getDate().getYear()+1900)+"-"+(r.getDate().getMonth()+1)+"-"+(r.getDate().getDate());
            StringURL urlReunion = new StringURL("http://82.223.14.220/ewp2486/ajouterReunion.php?date="+dateReunion
                    +"&titre="+r.getTitre()+"&theme=risqueRoutier"+"&idPAP="+idPAP);

            mapper.readValue(new URL(urlReunion.getString()),boolean.class);
        }

        for(Reunion r : papBDD.getReglementaire()){
            String dateReunion="";
            if (r.getDate()!=null) dateReunion=""+(r.getDate().getYear()+1900)+"-"+(r.getDate().getMonth()+1)+"-"+(r.getDate().getDate());
            StringURL urlReunion = new StringURL("http://82.223.14.220/ewp2486/ajouterReunion.php?date="+dateReunion
                    +"&titre="+r.getTitre()+"&theme=reglementaire"+"&idPAP="+idPAP);

            mapper.readValue(new URL(urlReunion.getString()),boolean.class);
        }


        for(Reunion r : papBDD.getComportemental()){
            String dateReunion="";
            if (r.getDate()!=null) dateReunion=""+(r.getDate().getYear()+1900)+"-"+(r.getDate().getMonth()+1)+"-"+(r.getDate().getDate());
            StringURL urlReunion = new StringURL("http://82.223.14.220/ewp2486/ajouterReunion.php?date="+dateReunion
                    +"&titre="+r.getTitre()+"&theme=comportemental"+"&idPAP="+idPAP);

            mapper.readValue(new URL(urlReunion.getString()),boolean.class);
        }

        for(Reunion r : papBDD.getLivretPrevention()){
            String dateReunion="";
            if (r.getDate()!=null) dateReunion=""+(r.getDate().getYear()+1900)+"-"+(r.getDate().getMonth()+1)+"-"+(r.getDate().getDate());
            StringURL urlReunion = new StringURL("http://82.223.14.220/ewp2486/ajouterReunion.php?date="+dateReunion
                    +"&titre="+r.getTitre()+"&theme=livretPrevention"+"&idPAP="+idPAP);

            mapper.readValue(new URL(urlReunion.getString()),boolean.class);
        }

        for(Reunion r : papBDD.getJourneeMetier()){
            String dateReunion="";
            if (r.getDate()!=null) dateReunion=""+(r.getDate().getYear()+1900)+"-"+(r.getDate().getMonth()+1)+"-"+(r.getDate().getDate());
            StringURL urlReunion = new StringURL("http://82.223.14.220/ewp2486/ajouterReunion.php?date="+dateReunion
                    +"&titre="+r.getTitre()+"&theme=journeeMetier"+"&idPAP="+idPAP);

            mapper.readValue(new URL(urlReunion.getString()),boolean.class);
        }


        return idPAP;
    }

    //Méthode pour lister les PAP en visuel sous forme d'une liste
    public List<PAP_BDD> getPAP() throws IOException {
        ObjectMapper mapper =new ObjectMapper();
        final DateFormat df =new SimpleDateFormat("dd/MM/yyyy");
        mapper.setDateFormat(df);
        List<PAP_BDD> res= mapper.readValue(new URL("http://82.223.14.220/ewp2486/listePAP.php"), List.class);
        return res;
    }

    //Méthode pour récuperer le PAP de l'année en cours
    public List<PAP_BDD> getPAPEnCours() throws IOException {
        ObjectMapper mapper =new ObjectMapper();
        final DateFormat df =new SimpleDateFormat("dd/MM/yyyy");
        mapper.setDateFormat(df);
        List<PAP_BDD> res= mapper.readValue(new URL("http://82.223.14.220/ewp2486/PAPEnCours.php"), List.class);
        return res;
    }

    // Méthode pour modifier les dates des reunions réalisées
    public boolean modifierPAP(PAP_BDD papBDD) throws IOException {
        ObjectMapper mapper =new ObjectMapper();
        final DateFormat df =new SimpleDateFormat("dd/MM/yyyy");
        mapper.setDateFormat(df);

        int idPAP=papBDD.getId();

        for(Reunion r : papBDD.getRisque()){
            String dateReunion="";
            if (r.getDate()!=null) dateReunion=""+(r.getDate().getYear()+1900+"-"+(r.getDate().getMonth()+1)+"-"+(r.getDate().getDate()));
            String dateReunionModif="";
            if (r.getDateModif()!=null) dateReunionModif=""+(r.getDateModif().getYear()+1900+"-"+(r.getDateModif().getMonth()+1)+"-"+(r.getDateModif().getDate()));
            StringURL urlReunion = new StringURL("http://82.223.14.220/ewp2486/modifierReunion.php?date="+dateReunion
                    +"&titre="+r.getTitre()+"&theme=risque"+"&idPAP="+idPAP+"&dateModif="+dateReunionModif);
            System.out.println(urlReunion.getString());

            mapper.readValue(new URL(urlReunion.getString()),boolean.class);
        }

        for(Reunion r : papBDD.getMre()){
            String dateReunion="";
            if (r.getDate()!=null) dateReunion=""+(r.getDate().getYear()+1900+"-"+(r.getDate().getMonth()+1)+"-"+(r.getDate().getDate()));
            String dateReunionModif="";
            if (r.getDateModif()!=null) dateReunionModif=""+(r.getDateModif().getYear()+1900+"-"+(r.getDateModif().getMonth()+1)+"-"+(r.getDateModif().getDate()));
            StringURL urlReunion = new StringURL("http://82.223.14.220/ewp2486/modifierReunion.php?date="+dateReunion
                    +"&titre="+r.getTitre()+"&theme=mre"+"&idPAP="+idPAP+"&dateModif="+dateReunionModif);

            mapper.readValue(new URL(urlReunion.getString()),boolean.class);
        }

        for(Reunion r : papBDD.getRisqueRoutier()){
            String dateReunion="";
            if (r.getDate()!=null) dateReunion=""+(r.getDate().getYear()+1900+"-"+(r.getDate().getMonth()+1)+"-"+(r.getDate().getDate()));
            String dateReunionModif="";
            if (r.getDateModif()!=null) dateReunionModif=""+(r.getDateModif().getYear()+1900+"-"+(r.getDateModif().getMonth()+1)+"-"+(r.getDateModif().getDate()));
            StringURL urlReunion = new StringURL("http://82.223.14.220/ewp2486/modifierReunion.php?date="+dateReunion
                    +"&titre="+r.getTitre()+"&theme=risqueRoutier"+"&idPAP="+idPAP+"&dateModif="+dateReunionModif);

            mapper.readValue(new URL(urlReunion.getString()),boolean.class);
        }

        for(Reunion r : papBDD.getReglementaire()){
            String dateReunion="";
            if (r.getDate()!=null) dateReunion=""+(r.getDate().getYear()+1900+"-"+(r.getDate().getMonth()+1)+"-"+(r.getDate().getDate()));
            String dateReunionModif="";
            if (r.getDateModif()!=null) dateReunionModif=""+(r.getDateModif().getYear()+1900+"-"+(r.getDateModif().getMonth()+1)+"-"+(r.getDateModif().getDate()));
            StringURL urlReunion = new StringURL("http://82.223.14.220/ewp2486/modifierReunion.php?date="+dateReunion
                    +"&titre="+r.getTitre()+"&theme=reglementaire"+"&idPAP="+idPAP+"&dateModif="+dateReunionModif);

            mapper.readValue(new URL(urlReunion.getString()),boolean.class);
        }


        for(Reunion r : papBDD.getComportemental()){
            String dateReunion="";
            if (r.getDate()!=null) dateReunion=""+(r.getDate().getYear()+1900+"-"+(r.getDate().getMonth()+1)+"-"+(r.getDate().getDate()));
            String dateReunionModif="";
            if (r.getDateModif()!=null) dateReunionModif=""+(r.getDateModif().getYear()+1900+"-"+(r.getDateModif().getMonth()+1)+"-"+(r.getDateModif().getDate()));
            StringURL urlReunion = new StringURL("http://82.223.14.220/ewp2486/modifierReunion.php?date="+dateReunion
                    +"&titre="+r.getTitre()+"&theme=comportemental"+"&idPAP="+idPAP+"&dateModif="+dateReunionModif);

            mapper.readValue(new URL(urlReunion.getString()),boolean.class);
        }

        for(Reunion r : papBDD.getLivretPrevention()){
            String dateReunion="";
            if (r.getDate()!=null) dateReunion=""+(r.getDate().getYear()+1900+"-"+(r.getDate().getMonth()+1)+"-"+(r.getDate().getDate()));
            String dateReunionModif="";
            if (r.getDateModif()!=null) dateReunionModif=""+(r.getDateModif().getYear()+1900+"-"+(r.getDateModif().getMonth()+1)+"-"+(r.getDateModif().getDate()));
            StringURL urlReunion = new StringURL("http://82.223.14.220/ewp2486/modifierReunion.php?date="+dateReunion
                    +"&titre="+r.getTitre()+"&theme=livretPrevention"+"&idPAP="+idPAP+"&dateModif="+dateReunionModif);

            mapper.readValue(new URL(urlReunion.getString()),boolean.class);
        }

        for(Reunion r : papBDD.getJourneeMetier()){
            String dateReunion="";
            if (r.getDate()!=null) dateReunion=""+(r.getDate().getYear()+1900+"-"+(r.getDate().getMonth()+1)+"-"+(r.getDate().getDate()));
            String dateReunionModif="";
            if (r.getDateModif()!=null) dateReunionModif=""+(r.getDateModif().getYear()+1900+"-"+(r.getDateModif().getMonth()+1)+"-"+(r.getDateModif().getDate()));
            StringURL urlReunion = new StringURL("http://82.223.14.220/ewp2486/modifierReunion.php?date="+dateReunion
                    +"&titre="+r.getTitre()+"&theme=journeeMetier"+"&idPAP="+idPAP+"&dateModif="+dateReunionModif);

            mapper.readValue(new URL(urlReunion.getString()),boolean.class);
        }

        return true;
    }
}
