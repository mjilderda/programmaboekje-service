package nl.jilderda.model.content;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class PupilContent {

    public String getPupilUitnodiging() {
        return """
                Hoi ouder/verzorger van <<pupil.vooornaam>>,\s
                
                Wat leuk dat <<pupil.voornaam>> zo enthousiast is! 😄
                \s
                Hierbij wat informatie over pupil van de week:
                
                  <<pupil.voornaam>> is op <<pupil.wedstrijddag>> in de wedstrijd tegen <<pupil.tegenstander>> de pupil van de week.
                \s
                Programmaboekje
                In het programmaboekje van de wedstrijd wordt ook aandacht besteed aan de pupil van de week.
                In de bijlagen vind je het invulformulier voor het programmaboekje. Wil je deze invullen, een (voetbal)foto van <<pupil.voornaam>> toevoegen en deze vóór <<pupil.inleverdagProgrammaboekje>> naar me terugmailen, zodat ik het programmaboekje tijdig bij de drukker aan kan leveren?
                Lukt het niet om de foto in het formulier te krijgen? Stuur deze foto dan als bijlage mee aan je mail. Dan zorg ik dat deze in het formulier terecht komt.
                \s
                Aanvang
                Een thuiswedstrijd van het eerste elftal start zaterdagmiddag altijd om 15:00 uur en duurt tot ongeveer 17:00 uur. Daarna is er voor <<pupil.voornaam>> patat.
                Jullie kunnen je zaterdag <<pupil.wedstrijddag>> om 14:15 uur melden in de bestuurskamer van DVC Appingedam.
                \s
                Kleding
                <<pupil.voornaam>> zal o.a. voor de wedstrijd met de wedstrijdselectie het veld op lopen, meedoen met de warming-up van de wisselspelers en de aftrap verzorgen. Het is dus aan te raden om kleding te dragen waarin hij lekker mee kan doen.
                Denk aan een (DVC) trainingspak of voetbaltenue (uiteraard afhankelijk van het weer) en uiteraard zijn voetbalschoenen.
                \s
                Voor vragen en/of opmerkingen kun je contact met me opnemen.
                \s
                Veel plezier voor <<pupil.voornaam>> toegewenst die dag! ⚽
                """;
    }
}
