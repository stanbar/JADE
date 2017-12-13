package pl.gda.pg.eti.kask.sa.alchemists.behaviours.mage;

import jade.core.AID;
import pl.gda.pg.eti.kask.sa.alchemists.agents.Mage;
import pl.gda.pg.eti.kask.sa.alchemists.behaviours.ReceiveResultBehaviour;
import pl.gda.pg.eti.kask.sa.alchemists.behaviours.RequestActionBehaviour;
import pl.gda.pg.eti.kask.sa.alchemists.ontology.SellArmor;

public class RequestArmorBehaviour extends RequestActionBehaviour<SellArmor, Mage> {

    public RequestArmorBehaviour(Mage agent, AID participant, SellArmor action) {
        super(agent, participant, action);
    }

    @Override
    protected ReceiveResultBehaviour createResultBehaviour(String conversationId) {
        return new ReceiveArmorBehaviour(myAgent, conversationId);
    }

}
