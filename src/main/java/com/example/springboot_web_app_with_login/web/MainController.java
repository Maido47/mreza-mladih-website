package com.example.springboot_web_app_with_login.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String home() {
        return "index";
    }

    /*@GetMapping("/users")
    public String users() {
        return "users";
    }*/

    /*@GetMapping("/login")
    public String login() {
        return "login";
    }*/

    @GetMapping("/forum")
    public String forum() {
        return "forum";
    }

    @GetMapping("/impressum")
    public String impressum() {
        return "impressum";
    }

    @GetMapping("/myprofile")
    public String myProfile() {
        return "myprofile";
    }

    @GetMapping("/countryPages/Australia/australia.html")
    public String australia() {
        return "countryPages/Australia/australia";
    }

    @GetMapping("/countryPages/Australia/melbourne.html")
    public String melbourne() {
        return "countryPages/Australia/melbourne";
    }

    @GetMapping("/countryPages/Australia/sydney.html")
    public String sydney() {
        return "countryPages/Australia/sydney";
    }

    @GetMapping("/countryPages/Australia/noblepark.html")
    public String noblepark() {
        return "countryPages/Australia/noblepark";
    }

    @GetMapping("/countryPages/Austria/austria.html")
    public String graz() {
        return "countryPages/Austria/graz";
    }

    @GetMapping("/countryPages/Austria/klagenfurt.html")
    public String klagenfurt() {
        return "countryPages/Austria/klagenfurt";
    }

    @GetMapping("/countryPages/Austria/linz.html")
    public String linz() {
        return "countryPages/Austria/linz";
    }

    @GetMapping("/countryPages/Austria/salzburg.html")
    public String salzburg() {
        return "countryPages/Austria/salzburg";
    }

    @GetMapping("/countryPages/Austria/villach.html")
    public String villach() {
        return "countryPages/Austria/villach";
    }

    @GetMapping("/countryPages/Austria/voralberg.html")
    public String voralberg() {
        return "countryPages/Austria/voralberg";
    }

    @GetMapping("/countryPages/Austria/wels.html")
    public String wels() {
        return "countryPages/Austria/wels";
    }

    @GetMapping("/countryPages/Austria/wien.html")
    public String wien() {
        return "countryPages/Austria/wien";
    }

    @GetMapping("/countryPages/Belgium/belgium.html")
    public String belgium() {
        return "countryPages/Belgium/belgium";
    }

    @GetMapping("/countryPages/Belgium/antwerpen.html")
    public String antwerpen() {
        return "countryPages/Belgium/antwerpen";
    }

    @GetMapping("/countryPages/Belgium/gent.html")
    public String gent() {
        return "countryPages/Belgium/gent";
    }

    @GetMapping("/countryPages/Belgium/liege.html")
    public String liege() {
        return "countryPages/Belgium/liege";
    }

    @GetMapping("/countryPages/Bosnia/bosnia.html")
    public String bosnia() {
        return "countryPages/Bosnia/bosnia";
    }

    @GetMapping("/countryPages/Bosnia/bihac.html")
    public String bihac() {
        return "countryPages/Bosnia/bihac";
    }

    @GetMapping("/countryPages/Bosnia/bugojno.html")
    public String bugojno() {
        return "countryPages/Bosnia/bugojno";
    }

    @GetMapping("/countryPages/Bosnia/buzim.html")
    public String buzim() {
        return "countryPages/Bosnia/buzim";
    }

    @GetMapping("/countryPages/Bosnia/donjivakuf.html")
    public String donjivakuf() {
        return "countryPages/Bosnia/donjivakuf";
    }

    @GetMapping("/countryPages/Bosnia/fojnica.html")
    public String fojnica() {
        return "countryPages/Bosnia/fojnica";
    }
    @GetMapping("/countryPages/Bosnia/gorazde.html")
    public String gorazde() {
        return "countryPages/Bosnia/gorazde";
    }

    @GetMapping("/countryPages/Bosnia/gradacac.html")
    public String gradacac() {
        return "countryPages/Bosnia/gradacac";
    }

    @GetMapping("/countryPages/Bosnia/jablanica.html")
    public String jablanica() {
        return "countryPages/Bosnia/jablanica";
    }

    @GetMapping("/countryPages/Bosnia/kakanj.html")
    public String kakanj() {
        return "countryPages/Bosnia/kakanj";
    }

    @GetMapping("/countryPages/Bosnia/konjic.html")
    public String konjic() {
        return "countryPages/Bosnia/konjic";
    }

    @GetMapping("/countryPages/Bosnia/kozarac.html")
    public String kozarac() {
        return "countryPages/Bosnia/kozarac";
    }

    @GetMapping("/countryPages/Bosnia/kruscica.html")
    public String kruscica() {
        return "countryPages/Bosnia/kruscica";
    }

    @GetMapping("/countryPages/Bosnia/mostar.html")
    public String mostar() {
        return "countryPages/Bosnia/mostar";
    }

    @GetMapping("/countryPages/Bosnia/prozor.html")
    public String prozor() {
        return "countryPages/Bosnia/prozor";
    }

    @GetMapping("/countryPages/Bosnia/sana.html")
    public String sana() {
        return "countryPages/Bosnia/sana";
    }

    @GetMapping("/countryPages/Bosnia/sarajevo.html")
    public String sarajevo() {
        return "countryPages/Bosnia/sarajevo";
    }

    @GetMapping("/countryPages/Bosnia/stolac.html")
    public String stolac() {
        return "countryPages/Bosnia/stolac";
    }

    @GetMapping("/countryPages/Bosnia/tesanj.html")
    public String tesanj() {
        return "countryPages/Bosnia/tesanj";
    }

    @GetMapping("/countryPages/Bosnia/tuzla.html")
    public String tuzla() {
        return "countryPages/Bosnia/tuzla";
    }

    @GetMapping("/countryPages/Bosnia/vakuf.html")
    public String vakuf() {
        return "countryPages/Bosnia/vakuf";
    }

    @GetMapping("/countryPages/Bosnia/visoko.html")
    public String visoko() {
        return "countryPages/Bosnia/visoko";
    }

    @GetMapping("/countryPages/Bosnia/vitez.html")
    public String vitez() {
        return "countryPages/Bosnia/vitez";
    }

    @GetMapping("/countryPages/Bosnia/zavidovici.html")
    public String zavidovici() {
        return "countryPages/Bosnia/zavidovici";
    }

    @GetMapping("/countryPages/Bosnia/zenica.html")
    public String zenica() {
        return "countryPages/Bosnia/zenica";
    }

    @GetMapping("/countryPages/Bosnia/zivinice.html")
    public String zivinice() {
        return "countryPages/Bosnia/zivinice";
    }

    @GetMapping("/countryPages/Canada/canada.html")
    public String canada() {
        return "countryPages/Canada/canada";
    }

    @GetMapping("/countryPages/Denmark/denmark.html")
    public String denmark() {
        return "countryPages/Denmark/denmark";
    }

    @GetMapping("/countryPages/Denmark/randers.html")
    public String randers() {
        return "countryPages/Canada/randers";
    }

    @GetMapping("/countryPages/Finland/finland.html")
    public String finland() {
        return "countryPages/Finland/finland";
    }

    @GetMapping("/countryPages/France/france.html")
    public String france() {
        return "countryPages/France/france";
    }

    @GetMapping("/countryPages/France/paris.html")
    public String paris() {
        return "countryPages/France/paris";
    }

    @GetMapping("/countryPages/France/sochaux.html")
    public String sochaux() {
        return "countryPages/France/sochaux";
    }

    @GetMapping("/countryPages/France/strasbourg.html")
    public String strasbourg() {
        return "countryPages/France/strasbourg";
    }

    @GetMapping("/countryPages/Germany/Aachen.html")
    public String aachen() {
        return "countryPages/Germany/Aachen";
    }

    @GetMapping("/countryPages/Germany/augsburg.html")
    public String augsburg() {
        return "countryPages/Germany/augsburg";
    }

    @GetMapping("/countryPages/Germany/baden.html")
    public String baden() {
        return "countryPages/Germany/baden";
    }

    @GetMapping("/countryPages/Germany/bayern.html")
    public String bayern() {
        return "countryPages/Germany/bayern";
    }

    @GetMapping("/countryPages/Germany/berlin.html")
    public String berlin() {
        return "countryPages/Germany/berlin";
    }

    @GetMapping("/countryPages/Germany/Bochum.html")
    public String bochum() {
        return "countryPages/Germany/Bochum";
    }

    @GetMapping("/countryPages/Germany/Bonn.html")
    public String bonn() {
        return "countryPages/Germany/Bonn";
    }

    @GetMapping("/countryPages/Germany/brandenburg.html")
    public String brandenburg() {
        return "countryPages/Germany/brandenburg";
    }

    @GetMapping("/countryPages/Germany/bremen.html")
    public String bremen() {
        return "countryPages/Germany/bremen";
    }

    @GetMapping("/countryPages/Germany/Dortmund.html")
    public String dortmund() {
        return "countryPages/Germany/Dortmund";
    }

    @GetMapping("/countryPages/Germany/düsseldorf.html")
    public String duesseldorf() {
        return "countryPages/Germany/düsseldorf";
    }

    @GetMapping("/countryPages/Germany/frankfurt.html")
    public String frankfurt() {
        return "countryPages/Germany/frankfurt";
    }

    @GetMapping("/countryPages/Germany/Germany.html")
    public String germany() {
        return "countryPages/Germany/Germany";
    }

    @GetMapping("/countryPages/Germany/hagen.html")
    public String hagen() {
        return "countryPages/Germany/hagen";
    }

    @GetMapping("/countryPages/Germany/hamburg.html")
    public String hamburg() {
        return "countryPages/Germany/hamburg";
    }

    @GetMapping("/countryPages/Germany/hamm.html")
    public String hamm() {
        return "countryPages/Germany/hamm";
    }

    @GetMapping("/countryPages/Germany/hannover.html")
    public String hannover() {
        return "countryPages/Germany/hannover";
    }

    @GetMapping("/countryPages/Germany/hessen.html")
    public String hessen() {
        return "countryPages/Germany/hessen";
    }

    @GetMapping("/countryPages/Germany/ingolstadt.html")
    public String ingolstadt() {
        return "countryPages/Germany/ingolstadt";
    }

    @GetMapping("/countryPages/Germany/kamplintfurt.html")
    public String kamplintfurt() {
        return "countryPages/Germany/kamplintfurt";
    }

    @GetMapping("/countryPages/Germany/karlsruhe.html")
    public String karlsruhe() {
        return "countryPages/Germany/karlsruhe";
    }

    @GetMapping("/countryPages/Germany/kassel.html")
    public String kassel() {
        return "countryPages/Germany/kassel";
    }

    @GetMapping("/countryPages/Germany/köln.html")
    public String koeln() {
        return "countryPages/Germany/köln";
    }

    @GetMapping("/countryPages/Germany/lörrach.html")
    public String lörrach() {
        return "countryPages/Germany/lörrach";
    }

    @GetMapping("/countryPages/Germany/mainz.html")
    public String mainz() {
        return "countryPages/Germany/mainz";
    }

    @GetMapping("/countryPages/Germany/mannheim.html")
    public String mannheim() {
        return "countryPages/Germany/mannheim";
    }

    @GetMapping("/countryPages/Germany/mülheim.html")
    public String mülheim() {
        return "countryPages/Germany/mülheim";
    }

    @GetMapping("/countryPages/Germany/münchen.html")
    public String münchen() {
        return "countryPages/Germany/münchen";
    }

    @GetMapping("/countryPages/Germany/niedersachsen.html")
    public String niedersachsen() {
        return "countryPages/Germany/niedersachsen";
    }

    @GetMapping("/countryPages/Germany/NRW.html")
    public String nrw() {
        return "countryPages/Germany/NRW";
    }

    @GetMapping("/countryPages/Germany/nürnberg.html")
    public String nuernberg() {
        return "countryPages/Germany/nürnberg";
    }

    @GetMapping("/countryPages/Germany/oberhausen.html")
    public String oberhausen() {
        return "countryPages/Germany/oberhausen";
    }

    @GetMapping("/countryPages/Germany/penzberg.html")
    public String penzberg() {
        return "countryPages/Germany/penzberg";
    }

    @GetMapping("/countryPages/Germany/rheinland.html")
    public String rheinland() {
        return "countryPages/Germany/rheinland";
    }

    @GetMapping("/countryPages/Germany/rosenheim.html")
    public String rosenheim() {
        return "countryPages/Germany/rosenheim";
    }

    @GetMapping("/countryPages/Germany/saarbrücken.html")
    public String saarbrücken() {
        return "countryPages/Germany/rosenheim";
    }

    @GetMapping("/countryPages/Germany/ssarland.html")
    public String saarland() {
        return "countryPages/Germany/saarland";
    }

    @GetMapping("/countryPages/Germany/stuttgart.html")
    public String stuttgart() {
        return "countryPages/Germany/stuttgart";
    }

    @GetMapping("/countryPages/Germany/tuttlingen.html")
    public String tuttlingen() {
        return "countryPages/Germany/tuttlingen";
    }

    @GetMapping("/countryPages/Germany/ulm.html")
    public String ulm() {
        return "countryPages/Germany/ulm";
    }

    @GetMapping("/countryPages/Germany/velbert.html")
    public String velbert() {
        return "countryPages/Germany/velbert";
    }

    @GetMapping("/countryPages/Germany/witten.html")
    public String witten() {
        return "countryPages/Germany/witten";
    }


    @GetMapping("/countryPages/Great Britain/uk.html")
    public String uk() {
        return "countryPages/Great Britain/uk";
    }

    @GetMapping("/countryPages/Ireland/ireland.html")
    public String ireland() {
        return "countryPages/Ireland/ireland";
    }

    @GetMapping("/countryPages/Italy/italy.html")
    public String italy() {
        return "countryPages/Italy/italy";
    }

    @GetMapping("/countryPages/Italy/piacenze.html")
    public String piacenze() {
        return "countryPages/Italy/piacenze";
    }

    @GetMapping("/countryPages/Liechtenstein/liechtenstein.html")
    public String liechtenstein() {
        return "countryPages/Liechtenstein/liechtenstein";
    }

    @GetMapping("/countryPages/luxembourg/luxembourg.html")
    public String louxembourg() {
        return "countryPages/Luxembourg/luxembourg";
    }

    @GetMapping("/countryPages/Netherlands/netherlands.html")
    public String netherlands() {
        return "countryPages/Netherlands/netherlands";
    }

    @GetMapping("/countryPages/Norway/norway.html")
    public String norway() {
        return "countryPages/Norway/norway";
    }

    @GetMapping("/countryPages/Sweden/Sweden.html")
    public String Sweden() {
        return "countryPages/Sweden/sweden";
    }

    @GetMapping("/countryPages/Switzerland/switzerland.html")
    public String switzerland() {
        return "countryPages/Switzerland/switzerland";
    }

    @GetMapping("/countryPages/USA/atalanta.html")
    public String atlanta() {
        return "countryPages/USA/atlanta";
    }

    @GetMapping("/countryPages/USA/chicago.html")
    public String chicago() {
        return "countryPages/USA/chicago";
    }

    @GetMapping("/countryPages/USA/colorado.html")
    public String colorado() {
        return "countryPages/USA/colorado";
    }

    @GetMapping("/countryPages/USA/connecticut.html")
    public String connecticut() {
        return "countryPages/USA/connecticut";
    }

    @GetMapping("/countryPages/USA/desmoines.html")
    public String desmoines() {
        return "countryPages/USA/desmoines";
    }

    @GetMapping("/countryPages/USA/detroit.html")
    public String detroit() {
        return "countryPages/USA/detroit";
    }

    @GetMapping("/countryPages/USA/granger.html")
    public String granger() {
        return "countryPages/USA/granger";
    }

    @GetMapping("/countryPages/USA/newhampshire.html")
    public String newhampshire() {
        return "countryPages/USA/newhampshire";
    }

    @GetMapping("/countryPages/USA/newjersey.html")
    public String newjersey() {
        return "countryPages/USA/newjersey";
    }

    @GetMapping("/countryPages/USA/newyork.html")
    public String newyork() {
        return "countryPages/USA/newyork";
    }

    @GetMapping("/countryPages/USA/northphoenix.html")
    public String northphoenix() {
        return "countryPages/USA/northphoenix";
    }

    @GetMapping("/countryPages/USA/portland.html")
    public String portland() {
        return "countryPages/USA/portland";
    }

    @GetMapping("/countryPages/USA/richmond.html")
    public String richmond() {
        return "countryPages/USA/richmond";
    }

    @GetMapping("/countryPages/USA/seattle.html")
    public String seattle() {
        return "countryPages/USA/seattle";
    }

    @GetMapping("/countryPages/USA/stlouis.html")
    public String stlouis() {
        return "countryPages/USA/stlouis";
    }

    @GetMapping("/countryPages/USA/usa.html")
    public String usa() {
        return "countryPages/USA/usa";
    }

    @GetMapping("/countryPages/USA/utah.html")
    public String utah() {
        return "countryPages/USA/utah";
    }

    @GetMapping("/countryPages/USA/utica.html")
    public String utica() {
        return "countryPages/USA/utica";
    }

}
