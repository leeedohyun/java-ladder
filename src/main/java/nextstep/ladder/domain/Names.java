package nextstep.ladder.domain;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Names {

    private final List<Name> names;

    public Names(final String[] names) {
        this.names = Arrays.stream(names)
                .map(Name::new)
                .collect(Collectors.toList());
    }

    public int findStartColumn(final Name name) {
        return names.indexOf(name);
    }

    public Map<Name, String> toResult() {
        return names.stream()
                .collect(Collectors.toMap(name -> name, name -> ""));
    }

    public int getNumberOfNames() {
        return names.size();
    }

    public List<Name> getNames() {
        return names;
    }
}
