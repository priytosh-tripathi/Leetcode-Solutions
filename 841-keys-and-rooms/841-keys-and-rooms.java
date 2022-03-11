class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
    Set<Integer> visited=new HashSet<>();
    addKey(0, rooms,visited);
    return visited.size() == rooms.size();
}

private void addKey(int room, List<List<Integer>> rooms,Set<Integer> visited) {
    visited.add(room);
    for (int key: rooms.get(room))
        if (!visited.contains(key)) addKey(key, rooms,visited);
    return;
}
}