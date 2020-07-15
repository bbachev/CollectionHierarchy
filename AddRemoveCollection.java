package collectionHierarchy;

public class AddRemoveCollection extends Collection implements Addable,AddRemovable {
    @Override
    public String remove() {
      return String.valueOf(this.items.remove(getLastElement()));

        }

    private int getLastElement() {
        if (super.items.size()>0){
            return super.items.size()-1;
        }
        return 0;

    }


    @Override
    public int add(String item) {
         this.items.add(0,item);
        return 0;
    }
}
