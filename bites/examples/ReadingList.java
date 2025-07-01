class ReadingList{
//    Define a class called ReadingList that has an instance field called unread that holds an Array of Strings.
//    Also, define a method called add which takes one argument (a book title) and adds it to the first empty slot in your unread Array.
//    NOTE: We're using Arrays here, not ArrayLists. This will make the task of adding items a bit more complex!
    String[] unread = new String[4];

    public static void main(String[] args) {
        ReadingList readingList = new ReadingList();
        readingList.add("Fire and Blood");
        readingList.add("A memory of light");
        System.out.println(readingList.unread[0]);
        System.out.println(readingList.unread[1]);
        System.out.println(readingList.unread[2]);
        System.out.println(readingList.unread[3]);
    }

    private void add(String title){
        Boolean continueSearch = true;
        Integer index = 0;
        while(continueSearch) {
            if(unread[index] == null){
                unread[index] = title;
                continueSearch = false;
            }else{
                index++;
            }
        }
    }

}