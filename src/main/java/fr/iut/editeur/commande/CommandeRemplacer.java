package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeRemplacer extends CommandeDocument {

    public CommandeRemplacer(Document document, String[] parameters) {
        super(document, parameters);
    }

    @Override
    public void executer() {
        String texte = "";
        if (parameters.length == 4) {
            texte = parameters[3];
        }
        this.document.remplacer(Integer.parseInt(parameters[1]),Integer.parseInt(parameters[2]), texte);
        super.executer();
    }
}
