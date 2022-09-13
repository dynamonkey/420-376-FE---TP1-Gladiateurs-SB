package combat;

public class CompteurDeTour {

    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Attributs">
    private int cptrTour;
    // </editor-fold>
    
    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Constructeurs et initialisation">
    public CompteurDeTour() {
        cptrTour = 1;
    }
    // </editor-fold>

    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Getters et setters">
    public void setCptrTour(int cptrTour) {
        this.cptrTour = cptrTour;
    }

    public int getCptrTour() {
        return cptrTour;
    }
    // </editor-fold>

    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Mécanique de jeu">
    public void augmenteTour() {
        setCptrTour(getCptrTour()+1); 
    }

    public void afficheTour() {
        System.out.println("----------------");
        System.out.println("TOUR ACTUEL : " + getCptrTour());
        System.out.println("----------------");
    }
    // </editor-fold>
}
