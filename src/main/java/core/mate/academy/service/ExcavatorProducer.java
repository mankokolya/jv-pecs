package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import java.util.List;

public class ExcavatorProducer<T extends Excavator> implements MachineProducer<T> {

    @Override
    public List<? extends Machine> get() {
        return List.of(new Excavator("Komatsu", "yellow", 0.5),
                new Excavator("Case", "red", 0.8),
                new Excavator("Caterpillar", "yellow", 1.0));
    }
}
