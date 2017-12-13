package pl.gda.pg.eti.kask.sa.alchemists.behaviours.armorist;

import jade.content.onto.basic.Action;
import jade.core.AID;
import pl.gda.pg.eti.kask.sa.alchemists.agents.Armorist;
import pl.gda.pg.eti.kask.sa.alchemists.behaviours.WaitingBehaviour;
import pl.gda.pg.eti.kask.sa.alchemists.ontology.SellArmor;

public class ArmoristBehaviour extends WaitingBehaviour<Armorist>{

    public ArmoristBehaviour(Armorist agent) {
        super(agent);
    }

    @Override
    protected void action(Action action, String conversationId, AID participant) {
        if (action.getAction() instanceof SellArmor) {
            myAgent.addBehaviour(new SellArmorBehaviour(myAgent, (SellArmor) action.getAction(), conversationId, participant));
        }
    }

}
