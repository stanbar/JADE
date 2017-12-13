package pl.gda.pg.eti.kask.sa.alchemists.agents;

import lombok.Getter;
import pl.gda.pg.eti.kask.sa.alchemists.behaviours.RegisterServiceBehaviour;
import pl.gda.pg.eti.kask.sa.alchemists.behaviours.alchemist.AlchemistBehaviour;
import pl.gda.pg.eti.kask.sa.alchemists.ontology.Potion;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author psysiu
 */
public class Alchemist extends BaseAgent {

    @Getter
    private final List<Potion> potions = new ArrayList<>();
    
    public Alchemist() {
    }

    @Override
    protected void setup() {
        super.setup();
//        potions.add(new Potion("Shrouding Potion"));
//        potions.add(new Potion("Heroic Potion"));
        fillPotions();
        addBehaviour(new RegisterServiceBehaviour(this, "alchemist"));
        addBehaviour(new AlchemistBehaviour(this));
    }

    private void fillPotions(){
        Object[] arguments = getArguments();
        if(arguments != null){
            for(Object arg : arguments) {
                if (arg instanceof Potion)
                    potions.add((Potion) arg);
            }
        }
    }
}
