package us.lynuxcraft.deadsilenceiv.advancedchests.services.economy;

import org.bukkit.entity.Player;

public interface EconomyService{

    /**
     * Gets the balance of specified player.
     *
     * @param player the player instance
     * @return the amount of balance.
     */
    double getBalance(Player player);

    /**
     * Withdraws some amount from the player's account.
     *
     * @param player the player instance
     * @param amount the amount to withdraw.
     */
    void withdraw(Player player,double amount);

    /**
     * Deposits some amount into the player's account.
     *
     * @param player the player instance
     * @param amount the amount to deposit.
     */
    void deposit(Player player,double amount);
}
