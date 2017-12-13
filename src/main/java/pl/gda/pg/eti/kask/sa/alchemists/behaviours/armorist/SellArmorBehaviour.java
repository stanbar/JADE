package pl.gda.pg.eti.kask.sa.alchemists.behaviours.armorist;
import jade.content.Predicate;
import jade.content.onto.basic.Result;
import jade.core.AID;
import pl.gda.pg.eti.kask.sa.alchemists.agents.Armorist;
import pl.gda.pg.eti.kask.sa.alchemists.behaviours.ActionBehaviour;
import pl.gda.pg.eti.kask.sa.alchemists.ontology.SellArmor;

public class SellArmorBehaviour extends ActionBehaviour<SellArmor, Armorist> {

    public SellArmorBehaviour(Armorist agent, SellArmor action, String conversationId, AID participant) {
        super(agent, action, conversationId, participant);
    }

    @Override
    protected Predicate performAction() {
        if (myAgent.getArmors().contains(action.getArmor())) {
            return new Result(action, action.getArmor());
        } else {
            return null;
        }
    }

}
