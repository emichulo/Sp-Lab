public interface Element {
void add(Element elm);
void remove(Element elm);
void print();

void accept(Visitor vis);
}
