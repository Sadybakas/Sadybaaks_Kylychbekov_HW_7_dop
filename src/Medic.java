public class Medic extends Hero{
    public double healPoints;
@Override
    public void aplySuperAbility() {
        super.aplySuperAbility();
        System.out.println("Medic used superAbility: HEAL");
        }
    public void increaseExperience(){
        healPoints = healPoints + (0.1 * healPoints);
        System.out.println("healing point: " + healPoints);
}}
