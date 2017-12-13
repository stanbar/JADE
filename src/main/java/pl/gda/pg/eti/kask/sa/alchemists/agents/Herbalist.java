package pl.gda.pg.eti.kask.sa.alchemists.agents;

import lombok.Getter;
import pl.gda.pg.eti.kask.sa.alchemists.behaviours.RegisterServiceBehaviour;
import pl.gda.pg.eti.kask.sa.alchemists.behaviours.herbalist.HerbalistBehaviour;
import pl.gda.pg.eti.kask.sa.alchemists.ontology.Herb;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author psysiu
 */
public class Herbalist extends BaseAgent {

    @Getter
    private final List<Herb> herbs = new ArrayList<>();
    
    public Herbalist() {
    }

    @Override
    protected void setup() {
        super.setup();

//        herbs.add(new Herb("Peacebloom"));
//        herbs.add(new Herb("Swiftthistle"));
//        herbs.add(new Herb("Sungrass"));
        fillHerbs();

        addBehaviour(new RegisterServiceBehaviour(this, "herbalist"));
        addBehaviour(new HerbalistBehaviour(this));
    }
    private void fillHerbs(){
        Object[] arguments = getArguments();
        if(arguments != null){
            for(Object arg : arguments) {
                if (arg instanceof Herb)
                    herbs.add((Herb) arg);
            }
        }
    }
}
