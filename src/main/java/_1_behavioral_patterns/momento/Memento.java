package _1_behavioral_patterns.momento;


import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Memento {
    private final String state;
}