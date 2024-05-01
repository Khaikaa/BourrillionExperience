package model.moderation;

@FunctionalInterface
public interface Entitlable {
    int entitle(String text, String[] triggerWords);
}
