package fr.iut.editeur.document;

public class Document {

    private String texte;

    public Document() {
        this.texte = "";
    }
	
    public String getTexte() {
        return texte;
    }

    public void setTexte(String texte) {
        this.texte = texte;
    }

    public void ajouter(String texte) {
        this.texte += texte;
    }

    /**
    * Description méthode
    * @param debut emplacement du début à remplacer
     * @param fin emplacement de la fin à remplacer
     * @param remplacement la chaine de caractère par laquelle on remplace
     */
    public void remplacer(int debut, int fin, String remplacement) {
        String partieGauche = texte.substring(0, debut);
        String partieDroite = texte.substring(fin + 1);
        texte = partieGauche + remplacement + partieDroite;
    }

    /**
     * Description méthode
     * met la partie de la chaine en majuscules
     * @param debut emplacement du début de la chaine à mettre en majuscules
     * @param fin emplacement de la fin à mettre en majuscules
     */
    public void majuscules(int debut, int fin) {
        String changement = texte.substring(debut, fin+1);
        changement = changement.toUpperCase();
        remplacer(debut, fin, changement);
    }

    public void effacer(int debut, int fin) {
        remplacer(debut, fin, "");
    }

    public void clear() {
        texte = "";
    }

    @Override
    public String toString() {
        return this.texte;
    }
}
