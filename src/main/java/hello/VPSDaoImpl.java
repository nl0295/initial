package hello;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;
import java.net.URL;
import java.util.List;

@Repository
@Transactional
public class VPSDaoImpl implements VPSDao{

    @Override
    public int ajouterVPS(VPS vps) throws IOException {
        ObjectMapper mapper =new ObjectMapper();
        String date=""+(vps.getDateVPS().getYear()+1900)+"-"+(vps.getDateVPS().getMonth()+1)+"-"+(vps.getDateVPS().getDate());
        System.out.println(date);
        StringURL url = new StringURL("http://82.223.14.220/ewp2486/ajouterVPS.php?date="+date+"&chantier="+vps.getChantierVPS()+"&visiteur="+vps.getVisiteurVPS()+"&duree="+vps.getDureeVPS()+"&chargeTrx="+vps.getChargeTravauxVPS()
                +"&nbAgent="+vps.getNbAgentVPS()+"&nomAgent1="+vps.getNomAgentVPS1()+"&nomAgent2="+vps.getNomAgentVPS2()+"&nomAgent3="+vps.getNomAgentVPS3()+"&nomAgent4="+vps.getNomAgentVPS4()+"&nomAgent5="+vps.getNomAgentVPS5()+"&nomAgent6="+vps.getNomAgentVPS6()
                +"&activite="+vps.getActiviteVPS()+"&designation="+vps.getDesignationInterv()+"&typeEnergie="+vps.getTypeE()+"&methode="+vps.getMethodeTvx()+"&remarque="+vps.getRemarqueVps()
                +"&topFait="+vps.isTopFait()+"&topTrace="+vps.isTopTrace()+"&risqueSignale="+vps.getRisqueSignale()+"&autreRisqueResp="+vps.getAutreRisqueResponsable()
                +"&respectCPP="+vps.getRespectCPP()+"&epi="+vps.getEpi()+"&trxEngin="+vps.getTrxEngin()+"&autreRisque="+vps.getAutresRisques()+"&organisation="+vps.getOrganisationIntervention()
                +"&proprete="+vps.getPropreteQualite()+"&delai="+vps.getDelaisTemps()+"&outillage="+vps.getEtatOutillage()+"&autreObs="+vps.getAutreObservation()+"&obsVisiteur="+vps.getObservationVisiteur()+"&obsVisite="+vps.getObservationVisite()
                +"&nbPtFort="+vps.getNbPtFort()+"&ptFort1="+vps.getPtFort1()+"&ptFort2="+vps.getPtFort2()+"&ptFort3="+vps.getPtFort3()
                +"&nbPtFaible="+vps.getNbPtFaible()
                +"&ptFaible1="+vps.getPtFaible1()+"&ptFaible2="+vps.getPtFaible2()+"&ptFaible3="+vps.getPtFaible3()+"&resp1="+vps.getResp1()+"&resp2="+vps.getResp2()+"&resp3="+vps.getResp3());
        System.out.println(url.getString());
        int res=mapper.readValue(new URL(url.getString()),Integer.class);
        return res;
    }

    @Override
    public List<VPS> getListeVPS() throws IOException {
        ObjectMapper mapper =new ObjectMapper();
        List<VPS> res= mapper.readValue(new URL("http://82.223.14.220/ewp2486/listeVPS.php"), List.class);
        return res;
    }

    @Override
    public List<VPS> getListeVPS(String login) throws IOException {
        ObjectMapper mapper =new ObjectMapper();
        List<VPS> res= mapper.readValue(new URL("http://82.223.14.220/ewp2486/vpsPSS.php?login="+login), List.class);
        return res;
    }
}
