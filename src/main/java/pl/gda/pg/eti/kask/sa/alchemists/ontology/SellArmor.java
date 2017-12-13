package pl.gda.pg.eti.kask.sa.alchemists.ontology;

import jade.content.AgentAction;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class SellArmor implements AgentAction{
    private Armor armor;
}
