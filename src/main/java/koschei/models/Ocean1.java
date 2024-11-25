package koschei.models;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Ocean1 {


    private final Island2 getIsland;

    public Ocean1(@Qualifier("getIsland") Island2 getIsland) {
        this.getIsland = getIsland;
    }

    @Override
    public String toString() {
        return "на океане остров " + getIsland.toString();
    }
}
