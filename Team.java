class Team {
    private String name;
    private Player[] onCourt;

    public Team(String name) {
        this.name = name;
        this.onCourt = new Player[5];
    }

    public String getName() {
        return this.name;
    }

    public int playerCount() {
        int count = 0;
        for (Player player : onCourt) {
            if (player != null) {
                count++;
            }
        }
        return count;
    }

    public boolean canEnter(Player player) {
        return (this.onCourt[player.getPosition()] == null);
    }

    public void subIn(Player player) {

        if (!canEnter(player)) return;

        onCourt[player.getPosition()] = player;
    }

    public void subOut(Player player) {
        if (onCourt[player.getPosition()] != player) return;

        onCourt[player.getPosition()] = null;
    }

}