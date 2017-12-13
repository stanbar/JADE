package pl.gda.pg.eti.kask.sa.alchemists.agents;

import lombok.Getter;
import pl.gda.pg.eti.kask.sa.alchemists.behaviours.RegisterServiceBehaviour;
import pl.gda.pg.eti.kask.sa.alchemists.behaviours.armorist.ArmoristBehaviour;
import pl.gda.pg.eti.kask.sa.alchemists.ontology.Armor;

import java.util.ArrayList;
import java.util.List;

public class Armorist extends BaseAgent {


    @Getter
    private final List<Armor> armors = new ArrayList<>();


    public Armorist(){

    }

    @Override
    protected void setup() {
        super.setup();
        fillArmors();
        addBehaviour(new RegisterServiceBehaviour(this,"armorist"));
        addBehaviour(new ArmoristBehaviour(this));
    }

    private void fillArmors(){
        Object[] arguments = getArguments();
        if(arguments != null){
            for(Object arg : arguments) {
                if (arg instanceof Armor)
                    armors.add((Armor) arg);
            }
        }
    }
}
