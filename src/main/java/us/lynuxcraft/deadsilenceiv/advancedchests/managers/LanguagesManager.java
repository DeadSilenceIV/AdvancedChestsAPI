package us.lynuxcraft.deadsilenceiv.advancedchests.managers;

import com.cryptomorin.xseries.XMaterial;
import lombok.Getter;
import org.bukkit.Material;
import org.bukkit.configuration.ConfigurationSection;
import us.lynuxcraft.deadsilenceiv.advancedchests.managers.yml.LanguagesConfiguration;

import java.util.List;
import java.util.Optional;

public class LanguagesManager {
    @Getter private String prefix;
    @Getter private String upgradesOnSuccess;
    @Getter private String upgradesOnFail;
    @Getter private String upgradesNewChestContainerForbiddenLocation;
    @Getter private String sortsOnFail;
    @Getter private String sortsAnythingToSort;
    @Getter private String sortsAlreadySorted;
    @Getter private String sellsOnSuccess;
    @Getter private String sellsOnFail;
    @Getter private String sellsOnSellProcess;
    @Getter private String openChestOnSellFail;
    @Getter private String permissionsOpenChestFail;
    @Getter private String permissionsPlaceChestFail;
    @Getter private String permissionsBreakChestFail;
    @Getter private String permissionsUpgradeFail;
    @Getter private String permissionsSortFail;
    @Getter private String permissionsSellFail;
    @Getter private String permissionsSmeltFail;
    @Getter private String permissionsCompressorFail;
    @Getter private String permissionsDepositFail;
    @Getter private String guiPreviousPageName;
    @Getter private String guiPreviousPageHead;
    @Getter private Material guiPreviousPageMaterial;
    @Getter private List<String> guiPreviousPageLore;
    @Getter private Integer guiPreviousPageCustomModelData;
    @Getter private String guiNextPageName;
    @Getter private String guiNextPageHead;
    @Getter private Material guiNextPageMaterial;
    @Getter private List<String> guiNextPageLore;
    @Getter private Integer guiNextPageCustomModelData;
    @Getter private Material guiUpgradeIconMaterial;
    @Getter private String guiUpgradeIconName;
    @Getter private List<String> guiUpgradeIconLore;
    @Getter private String guiUpgradeIconHead;
    @Getter private Integer guiUpgradeIconCustomModelData;
    @Getter private String guiInfiniteItemIconName;
    @Getter private List<String> guiInfiniteItemIconLore;
    @Getter private String guiInfiniteItemIconPlaceholdersItemLoreTitle;
    @Getter private String guiInfiniteItemIconPlaceholdersItemLoreSubTitle;
    @Getter private String guiInfiniteItemIconPlaceholdersItemLoreLine;
    @Getter private String deleteConfirmationInvName;
    @Getter private Material deleteConfirmationIconMaterial;
    @Getter private String deleteConfirmationIconName;
    @Getter private List<String> deleteConfirmationIconLore;
    @Getter private String deleteConfirmationIconHead;
    @Getter private Integer deleteConfirmationIconCustomModelData;
    @Getter private String upgradeConfirmationInvName;
    @Getter private Material upgradeConfirmationIconMaterial;
    @Getter private String upgradeConfirmationIconName;
    @Getter private List<String> upgradeConfirmationIconLore;
    @Getter private String upgradeConfirmationIconHead;
    @Getter private Integer upgradeConfirmationIconCustomModelData;
    @Getter private String sellConfirmationInvName;
    @Getter private Material sellConfirmationIconMaterial;
    @Getter private String sellConfirmationIconName;
    @Getter private List<String> sellConfirmationIconLore;
    @Getter private String sellConfirmationIconHead;
    @Getter private Integer sellConfirmationIconCustomModelData;
    @Getter private String smeltConfirmationInvName;
    @Getter private Material smeltConfirmationIconMaterial;
    @Getter private String smeltConfirmationIconName;
    @Getter private List<String> smeltConfirmationIconLore;
    @Getter private String smeltConfirmationIconHead;
    @Getter private Integer smeltConfirmationIconCustomModelData;
    @Getter private String compressConfirmationInvName;
    @Getter private Material compressConfirmationIconMaterial;
    @Getter private String compressConfirmationIconName;
    @Getter private List<String> compressConfirmationIconLore;
    @Getter private String compressConfirmationIconHead;
    @Getter private Integer compressConfirmationIconCustomModelData;
    @Getter private String sortersInventoryName;
    @Getter private String sortersPriceFormat;
    @Getter private Material sortersIconMaterial;
    @Getter private String sortersIconName;
    @Getter private List<String> sortersIconLore;
    @Getter private String sortersIconHead;
    @Getter private Integer sortersIconCustomModelData;
    @Getter private Material sortersBackMaterial;
    @Getter private String sortersBackName;
    @Getter private List<String> sortersBackLore;
    @Getter private String sortersBackHead;
    @Getter private Integer sortersBackCustomModelData;
    @Getter private Material sortersTypesByAllMaterial;
    @Getter private String sortersTypesByAllHead;
    @Getter private String sortersTypesByAllName;
    @Getter private List<String> sortersTypesByAllLore;
    @Getter private Integer sortersTypesByAllCustomModelData;
    @Getter private Material sortersTypesByMaterialMaterial;
    @Getter private String sortersTypesByMaterialHead;
    @Getter private String sortersTypesByMaterialName;
    @Getter private List<String> sortersTypesByMaterialLore;
    @Getter private Integer sortersTypesByMaterialCustomModelData;
    @Getter private Material sortersTypesByAmountMaterial;
    @Getter private String sortersTypesByAmountHead;
    @Getter private String sortersTypesByAmountName;
    @Getter private List<String> sortersTypesByAmountLore;
    @Getter private Integer sortersTypesByAmountCustomModelData;
    @Getter private Material sortersTypesByDamageMaterial;
    @Getter private String sortersTypesByDamageHead;
    @Getter private String sortersTypesByDamageName;
    @Getter private List<String> sortersTypesByDamageLore;
    @Getter private Integer sortersTypesByDamageCustomModelData;
    @Getter private Material sellsIconMaterial;
    @Getter private String sellsIconName;
    @Getter private String sellsIconHead;
    @Getter private List<String> sellsIconLore;
    @Getter private Integer sellsIconCustomModelData;
    @Getter private String shopInventoryName;
    @Getter private List<String> shopLoreFormat;
    @Getter private String shopPreviousName;
    @Getter private String shopPreviousHead;
    @Getter private Material shopPreviousMaterial;
    @Getter private List<String> shopPreviousLore;
    @Getter private Integer shopPreviousCustomModelData;
    @Getter private String shopNextName;
    @Getter private String shopNextHead;
    @Getter private Material shopNextMaterial;
    @Getter private List<String> shopNextLore;
    @Getter private Integer shopNextCustomModelData;
    @Getter private String shopOnSuccess;
    @Getter private String shopOnFail;
    @Getter private String shopWithoutInventorySpace;
    @Getter private String shopPriceFormat;
    @Getter private String shopWithoutPermsToOpen;
    @Getter private String onBreakWaitForEmptyChestFail;
    @Getter private String guiAutoSellsInventoryName;
    @Getter private String guiAutoSellsIconName;
    @Getter private String guiAutoSellsIconHead;
    @Getter private List<String> guiAutoSellsIconLore;
    @Getter private Material guiAutoSellsIconMaterial;
    @Getter private Integer guiAutoSellsIconCustomModelData;
    @Getter private Material guiAutoSellsMoneyIconMaterial;
    @Getter private String guiAutoSellsMoneyIconHead;
    @Getter private String guiAutoSellsMoneyIconName;
    @Getter private List<String> guiAutoSellsMoneyIconLore;
    @Getter private Integer guiAutoSellsMoneyIconCustomModelData;
    @Getter private String guiAutoSellsToggleIconOnHead;
    @Getter private String guiAutoSellsToggleIconOnName;
    @Getter private List<String> guiAutoSellsToggleIconOnLore;
    @Getter private Material guiAutoSellsToggleIconOnMaterial;
    @Getter private Integer guiAutoSellsToggleIconOnCustomModelData;
    @Getter private String guiAutoSellsToggleIconOffHead;
    @Getter private String guiAutoSellsToggleIconOffName;
    @Getter private List<String> guiAutoSellsToggleIconOffLore;
    @Getter private Material guiAutoSellsToggleIconOffMaterial;
    @Getter private Integer guiAutoSellsToggleIconOffCustomModelData;
    @Getter private Material guiAutoSellsBackMaterial;
    @Getter private String guiAutoSellsBackHead;
    @Getter private String guiAutoSellsBackName;
    @Getter private List<String> guiAutoSellsBackLore;
    @Getter private Integer guiAutoSellsBackCustomModelData;
    @Getter private String autoSellsClaimMoneySuccess;
    @Getter private String autoSellsClaimMoneyFail;
    @Getter private String autoSellsToggleFail;
    @Getter private String infiniteItemsSuccessfullyRedeemed;
    @Getter private String infiniteItemsNotEnoughSpaceToRedeem;
    @Getter private String infiniteItemsNotEnoughItemsToRedeem;
    @Getter private Material guiSmelterIconMaterial;
    @Getter private String guiSmelterIconHead;
    @Getter private String guiSmelterIconName;
    @Getter private String guiSmelterIconPriceFormat;
    @Getter private List<String> guiSmelterIconLore;
    @Getter private Integer guiSmelterIconCustomModelData;
    @Getter private String smeltingNotEnoughMoney;
    @Getter private String smeltingOnSuccess;
    @Getter private String smeltingOnFail;
    @Getter private Material guiCompressorIconMaterial;
    @Getter private String guiCompressorIconHead;
    @Getter private String guiCompressorIconName;
    @Getter private String guiCompressorIconPriceFormat;
    @Getter private List<String> guiCompressorIconLore;
    @Getter private Integer guiCompressorIconCustomModelData;
    @Getter private String compressionNotEnoughMoney;
    @Getter private String compressionNotEnoughSpaceToCompress;
    @Getter private String compressionOnSuccess;
    @Getter private String compressionAnythingToCompress;
    @Getter private String compressionOnCompressProcess;
    @Getter private String openChestOnCompressionFail;
    private ConfigurationSection languages;
    public LanguagesManager(){
        languages = new LanguagesConfiguration().getSection();
        loadLang();
    }

    /**
     * Stores all the languages.yml file content in variables.
     */
    private void loadLang(){
        prefix = languages.getString("prefix","&8[&e&lAdvanced&6&lChests&8]");
        upgradesOnSuccess = languages.getString("upgrades.success","&aThe chest was upgraded correctly&6!");
        upgradesOnFail = languages.getString("upgrades.fail","&cYou do not have enough money to buy this upgrade&6!");
        upgradesNewChestContainerForbiddenLocation = languages.getString("upgrades.new-chest-container-forbidden-location","&cThe new type of container can not have chests around.");
        sortsOnFail = languages.getString("sorts.fail","&cYou do not have enough money to do this!");
        sortsAnythingToSort = languages.getString("sorts.anything-to-sort","&cThere is anything to sort in this chest!");
        sortsAlreadySorted = languages.getString("sorts.already-sorted","&cThis chest is already sorted!");
        sellsOnSuccess = languages.getString("sells.success","&aYou have received &e%value%$&a!");
        sellsOnFail = languages.getString("sells.fail","&cThis chest don't have nothing for selling&6!");
        sellsOnSellProcess = languages.getString("sells.process","&cThe chest will be sold in &6%time% &cseconds&6!");
        openChestOnSellFail = languages.getString("sells.openchest-onsell-fail","&cThis chest is currently being sold, please wait...&6!");

        //Permissions Fails
        permissionsOpenChestFail = languages.getString("permissions.openchest-fail","&cYou don't have permissions to open this chest&6!");
        permissionsPlaceChestFail = languages.getString("permissions.placechest-fail","&cYou do not have permissions to place this chest&6!");
        permissionsBreakChestFail = languages.getString("permissions.breakchest-fail","&cYou do not have permissions for break this chest&6!");
        permissionsUpgradeFail = languages.getString("permissions.upgrade-fail","&cYou don't have permissions to do this upgrade&6!");
        permissionsSortFail = languages.getString("permissions.sort-fail","&cYou don't have permissions to do this sort&6!");
        permissionsSellFail = languages.getString("permissions.sell-fail","&cYou don't have permissions to sell this chest&6!");
        permissionsSmeltFail = languages.getString("permissions.smelt-fail","&cYou do not have the proper permissions to smelt this chest&6!");
        permissionsCompressorFail = languages.getString("permissions.compressor-fail","&cYou do not have the proper permissions to compress this chest&6!");
        shopWithoutPermsToOpen = languages.getString("shop.without-perms-to-open","&cYou do not have permissions&6!");
        autoSellsToggleFail = languages.getString("autosells.toggle-fail","&cYou don't have permissions to toggle this option&6!");
        infiniteItemsSuccessfullyRedeemed = languages.getString("infinite-items.successfully-redeemed","&aThe item was successfully redeemed!");
        infiniteItemsNotEnoughSpaceToRedeem = languages.getString("infinite-items.not-enough-space-to-redeem","&cYou don't have enough space to redeem this item!");
        infiniteItemsNotEnoughItemsToRedeem = languages.getString("infinite-items.not-enough-items-to-redeem","&cThere isn't enough items to redeem the requested quantity!");
        permissionsDepositFail = languages.getString("permissions.deposit-fail","&cYou don not have permissions to deposit items inside this chest!");
        permissionsOpenChestFail = replacePlaceholders(permissionsOpenChestFail,"%permission%","advancedchests.open.%chest_type%");
        permissionsPlaceChestFail = replacePlaceholders(permissionsPlaceChestFail,"%permission%","advancedchests.place.%chest_type%");
        permissionsBreakChestFail = replacePlaceholders(permissionsBreakChestFail,"%permission%","advancedchests.break.%chest_type%");
        permissionsUpgradeFail = replacePlaceholders(permissionsUpgradeFail,"%permission%","advancedchests.upgrade.%chest_type%");
        permissionsSortFail = replacePlaceholders(permissionsSortFail,"%permission%","advancedchests.sort.%chest_type%");
        permissionsSellFail = replacePlaceholders(permissionsSellFail,"%permission%","advancedchests.sell.%chest_type%");
        permissionsSmeltFail = replacePlaceholders(permissionsSmeltFail,"%permission%","advancedchests.smelt.%chest_type%");
        permissionsCompressorFail = replacePlaceholders(permissionsCompressorFail,"%permission%","advancedchests.compress.%chest_type%");
        shopWithoutPermsToOpen = replacePlaceholders(shopWithoutPermsToOpen,"%permission%","advancedchests.shop.open");
        autoSellsToggleFail = replacePlaceholders(autoSellsToggleFail,"%permission%","advancedchests.autosells.toggle");
        permissionsDepositFail = replacePlaceholders(permissionsDepositFail,"%permission%","advancedchests.deposit.%chest_type%");

        guiPreviousPageName = languages.getString("gui.previouspage.name","&6&lPrevious page");
        guiPreviousPageHead = languages.getString("gui.previouspage.head","MHF_ArrowLeft");
        guiPreviousPageMaterial = fetchMaterial("gui.previouspage.material",XMaterial.PLAYER_HEAD.parseMaterial());
        guiPreviousPageLore = languages.getStringList("gui.previouspage.lore");
        guiPreviousPageCustomModelData = languages.getInt("gui.previouspage.custom-model-data");
        guiNextPageName = languages.getString("gui.nextpage.name","&6&lNext page");
        guiNextPageHead = languages.getString("gui.nextpage.head","MHF_ArrowRight");
        guiNextPageMaterial = fetchMaterial("gui.nextpage.material",XMaterial.PLAYER_HEAD.parseMaterial());
        guiNextPageLore = languages.getStringList("gui.nextpage.lore");
        guiNextPageCustomModelData = languages.getInt("gui.nextpage.custom-model-data");
        guiUpgradeIconMaterial = fetchMaterial("gui.upgradeicon.material",XMaterial.CHEST.parseMaterial());
        guiUpgradeIconName = languages.getString("gui.upgradeicon.name","&e&lUpgrade your slots&6&l!");
        guiUpgradeIconLore = languages.getStringList("gui.upgradeicon.lore");
        guiUpgradeIconHead = languages.getString("gui.upgradeicon.head");
        guiUpgradeIconCustomModelData = languages.getInt("gui.upgradeicon.custom-model-data");

        guiInfiniteItemIconName = languages.getString("gui.infiniteitemicon.name","%item-name%");
        guiInfiniteItemIconLore = languages.getStringList("gui.infiniteitemicon.lore");
        guiInfiniteItemIconPlaceholdersItemLoreTitle = languages.getString("gui.infiniteitemicon.placeholders.item-lore.title");
        guiInfiniteItemIconPlaceholdersItemLoreSubTitle = languages.getString("gui.infiniteitemicon.placeholders.item-lore.subtitle");
        guiInfiniteItemIconPlaceholdersItemLoreLine = languages.getString("gui.infiniteitemicon.placeholders.item-lore.line","%line%");

        deleteConfirmationInvName = languages.getString("gui.break-confirmation.inventoryname","&c&lRemove the Chest...");
        deleteConfirmationIconMaterial = fetchMaterial("gui.break-confirmation.confirmicon.material",XMaterial.BARRIER.parseMaterial());
        deleteConfirmationIconName = languages.getString("gui.break-confirmation.confirmicon.name","&cBreak this chest!");
        deleteConfirmationIconLore = languages.getStringList("gui.break-confirmation.confirmicon.lore");
        deleteConfirmationIconHead = languages.getString("gui.break-confirmation.confirmicon.head");
        deleteConfirmationIconCustomModelData = languages.getInt("gui.break-confirmation.confirmicon.custom-model-data");

        upgradeConfirmationInvName = languages.getString("gui.upgrade-confirmation.inventoryname","&8Confirm your upgrade!");
        upgradeConfirmationIconMaterial = fetchMaterial("gui.upgrade-confirmation.confirmicon.material",XMaterial.CHEST.parseMaterial());
        upgradeConfirmationIconName = languages.getString("gui.upgrade-confirmation.confirmicon.name","&e&lUpgrade!");
        upgradeConfirmationIconLore = languages.getStringList("gui.upgrade-confirmation.confirmicon.lore");
        upgradeConfirmationIconHead = languages.getString("gui.upgrade-confirmation.confirmicon.head");
        upgradeConfirmationIconCustomModelData = languages.getInt("gui.upgrade-confirmation.confirmicon.custom-model-data");

        sellConfirmationInvName = languages.getString("gui.sell-confirmation.inventoryname","&8Confirm your sell!");
        sellConfirmationIconMaterial = fetchMaterial("gui.sell-confirmation.confirmicon.material",XMaterial.PLAYER_HEAD.parseMaterial());
        sellConfirmationIconName = languages.getString("gui.sell-confirmation.confirmicon.name","&c&lSell the content!");
        sellConfirmationIconLore = languages.getStringList("gui.sell-confirmation.confirmicon.lore");
        sellConfirmationIconHead = languages.getString("gui.sell-confirmation.confirmicon.head");
        sellConfirmationIconCustomModelData = languages.getInt("gui.sell-confirmation.confirmicon.custom-model-data");

        smeltConfirmationInvName = languages.getString("gui.smelt-confirmation.inventoryname","&8Confirm your smelt!");
        smeltConfirmationIconMaterial = fetchMaterial("gui.smelt-confirmation.confirmicon.material",XMaterial.PLAYER_HEAD.parseMaterial());
        smeltConfirmationIconName = languages.getString("gui.smelt-confirmation.confirmicon.name","&6&lSmelt the content!");
        smeltConfirmationIconLore = languages.getStringList("gui.smelt-confirmation.confirmicon.lore");
        smeltConfirmationIconHead = languages.getString("gui.smelt-confirmation.confirmicon.head");
        smeltConfirmationIconCustomModelData = languages.getInt("gui.smelt-confirmation.confirmicon.custom-model-data");

        compressConfirmationInvName = languages.getString("gui.compress-confirmation.inventoryname","&8Confirm your compression!");
        compressConfirmationIconMaterial = fetchMaterial("gui.compress-confirmation.confirmicon.material",XMaterial.PLAYER_HEAD.parseMaterial());
        compressConfirmationIconName = languages.getString("gui.compress-confirmation.confirmicon.name","&f&lCompress the content!");
        compressConfirmationIconLore = languages.getStringList("gui.compress-confirmation.confirmicon.lore");
        compressConfirmationIconHead = languages.getString("gui.compress-confirmation.confirmicon.head");
        compressConfirmationIconCustomModelData = languages.getInt("gui.compress-confirmation.confirmicon.custom-model-data");

        sortersInventoryName = languages.getString("gui.sorters.inventory-name","&7Sort the chest!");
        sortersPriceFormat = languages.getString("gui.sorters.price-format","&ePrice&6: &e%price%&6$");
        sortersIconMaterial = fetchMaterial("gui.sorters.sorticon.material",XMaterial.HOPPER.parseMaterial());
        sortersIconName = languages.getString("gui.sorters.sorticon.name","&f&lSort the chest");
        sortersIconLore = languages.getStringList("gui.sorters.sorticon.lore");
        sortersIconHead = languages.getString("gui.sorters.sorticon.head");
        sortersIconCustomModelData = languages.getInt("gui.sorters.sorticon.custom-model-data");
        sortersBackMaterial = fetchMaterial("gui.sorters.back.material",XMaterial.PLAYER_HEAD.parseMaterial());
        sortersBackName = languages.getString("gui.sorters.back.name","&6&lBack");
        sortersBackLore = languages.getStringList("gui.sorters.back.lore");
        sortersBackHead = languages.getString("gui.sorters.back.head","MHF_ArrowLeft");
        sortersBackCustomModelData = languages.getInt("gui.sorters.back.custom-model-data");
        sortersTypesByAllMaterial = fetchMaterial("gui.sorters.types.byall.material",XMaterial.PLAYER_HEAD.parseMaterial());
        sortersTypesByAllHead = languages.getString("gui.sorters.types.byall.head");
        sortersTypesByAllName = languages.getString("gui.sorters.types.byall.name","&e&lSort by all!");
        sortersTypesByAllLore = languages.getStringList("gui.sorters.types.byall.lore");
        sortersTypesByAllCustomModelData = languages.getInt("gui.sorters.types.byall.custom-model-data");
        sortersTypesByMaterialMaterial = fetchMaterial("gui.sorters.types.bymaterial.material",XMaterial.PLAYER_HEAD.parseMaterial());
        sortersTypesByMaterialHead = languages.getString("gui.sorters.types.bymaterial.head");
        sortersTypesByMaterialName = languages.getString("gui.sorters.types.bymaterial.name","&e&lSort by material!");
        sortersTypesByMaterialLore = languages.getStringList("gui.sorters.types.bymaterial.lore");
        sortersTypesByMaterialCustomModelData = languages.getInt("gui.sorters.types.bymaterial.custom-model-data");
        sortersTypesByAmountMaterial = fetchMaterial("gui.sorters.types.byamount.material",XMaterial.PLAYER_HEAD.parseMaterial());
        sortersTypesByAmountHead = languages.getString("gui.sorters.types.byamount.head");
        sortersTypesByAmountName = languages.getString("gui.sorters.types.byamount.name","&e&lSort by amount!");
        sortersTypesByAmountLore = languages.getStringList("gui.sorters.types.byamount.lore");
        sortersTypesByAmountCustomModelData = languages.getInt("gui.sorters.types.byamount.custom-model-data");
        sortersTypesByDamageMaterial = fetchMaterial("gui.sorters.types.bydamage.material",XMaterial.PLAYER_HEAD.parseMaterial());
        sortersTypesByDamageHead = languages.getString("gui.sorters.types.bydamage.head");
        sortersTypesByDamageName = languages.getString("gui.sorters.types.bydamage.name","&e&lSort by damage!");
        sortersTypesByDamageLore = languages.getStringList("gui.sorters.types.bydamage.lore");
        sortersTypesByDamageCustomModelData = languages.getInt("gui.sorters.types.bydamage.custom-model-data");

        sellsIconMaterial = fetchMaterial("gui.sells.sellicon.material",XMaterial.PLAYER_HEAD.parseMaterial());
        sellsIconName = languages.getString("gui.sells.sellicon.name","&c&lSell All");
        sellsIconHead = languages.getString("gui.sells.sellicon.head","MrSnowDK");
        sellsIconLore = languages.getStringList("gui.sells.sellicon.lore");
        sellsIconCustomModelData = languages.getInt("gui.sells.sellicon.custom-model-data");
        shopInventoryName = languages.getString("shop.inventoryname","&c&e&lAdvanced&6&lChests");
        shopLoreFormat = languages.getStringList("shop.lore-format");
        shopPreviousName = languages.getString("shop.previous.name","&6&lPrevious");
        shopPreviousHead = languages.getString("shop.previous.head","MHF_ArrowLeft");
        shopPreviousMaterial = fetchMaterial("shop.previous.material",XMaterial.PLAYER_HEAD.parseMaterial());
        shopPreviousLore = languages.getStringList("shop.previous.lore");
        shopPreviousCustomModelData = languages.getInt("shop.previous.custom-model-data");
        shopNextName = languages.getString("shop.next.name","&6&lNext");
        shopNextHead = languages.getString("shop.next.head","MHF_ArrowRight");
        shopNextMaterial = fetchMaterial("shop.next.material",XMaterial.PLAYER_HEAD.parseMaterial());
        shopNextLore = languages.getStringList("shop.next.lore");
        shopNextCustomModelData = languages.getInt("shop.next.custom-model-data");
        shopOnSuccess = languages.getString("shop.success","&aYou have bought correctly&6!");
        shopOnFail = languages.getString("shop.fail","&cYou don't have enough money to buy this chest&6!");
        shopWithoutInventorySpace = languages.getString("shop.without-inv-space","&cYou don't have enough space in your inventory&6!");
        shopPriceFormat = languages.getString("shop.price-format");
        onBreakWaitForEmptyChestFail = languages.getString("actions.on-break-wait-for-empty-chest-fail","&cThe chest needs to be empty to break it&6!");
        guiAutoSellsInventoryName = languages.getString("gui.autosells.inventory-name","&8AutoSells");
        guiAutoSellsIconName = languages.getString("gui.autosells.icon.name","&6&lAutomatic Sells");
        guiAutoSellsIconHead = languages.getString("gui.autosells.icon.head","945f47feb4d75cb333914bfdb999a489c9d0e320d548f310419ad738d1e24b9");
        guiAutoSellsIconLore = languages.getStringList("gui.autosells.icon.lore");
        guiAutoSellsIconMaterial = fetchMaterial("gui.autosells.icon.material",XMaterial.PLAYER_HEAD.parseMaterial());
        guiAutoSellsIconCustomModelData = languages.getInt("gui.autosells.icon.custom-model-data");
        guiAutoSellsMoneyIconMaterial = fetchMaterial("gui.autosells.moneyicon.material",XMaterial.CHEST.parseMaterial());
        guiAutoSellsMoneyIconHead = languages.getString("gui.autosells.moneyicon.head");
        guiAutoSellsMoneyIconName = languages.getString("gui.autosells.moneyicon.name","&e&lClaim the money!");
        guiAutoSellsMoneyIconLore = languages.getStringList("gui.autosells.moneyicon.lore");
        guiAutoSellsMoneyIconCustomModelData = languages.getInt("gui.autosells.moneyicon.custom-model-data");
        guiAutoSellsToggleIconOnMaterial = fetchMaterial("gui.autosells.toggleicon.on-status.material",XMaterial.PLAYER_HEAD.parseMaterial());
        guiAutoSellsToggleIconOnHead = languages.getString("gui.autosells.toggleicon.on-status.head","131a4fab2f87db54330136517b453aacb9d7c0fe784300709e9b109cbc514f00");
        guiAutoSellsToggleIconOnName = languages.getString("gui.autosells.toggleicon.on-status.name","&6&lToggle AutoSells");
        guiAutoSellsToggleIconOnLore = languages.getStringList("gui.autosells.toggleicon.on-status.lore");
        guiAutoSellsToggleIconOnCustomModelData = languages.getInt("gui.autosells.toggleicon.on-status.custom-model-data");
        guiAutoSellsToggleIconOffMaterial = fetchMaterial("gui.autosells.toggleicon.off-status.material",XMaterial.PLAYER_HEAD.parseMaterial());
        guiAutoSellsToggleIconOffHead = languages.getString("gui.autosells.toggleicon.off-status.head","a5d53ef428b369fd5cce94ce205d0d2d7b095fad676a9b383971ee1049e367ad");
        guiAutoSellsToggleIconOffName = languages.getString("gui.autosells.toggleicon.off-status.name","&6&lToggle AutoSells");
        guiAutoSellsToggleIconOffLore = languages.getStringList("gui.autosells.toggleicon.off-status.lore");
        guiAutoSellsToggleIconOffCustomModelData = languages.getInt("gui.autosells.toggleicon.off-status.custom-model-data");
        guiAutoSellsBackMaterial = fetchMaterial("gui.autosells.back.material",XMaterial.PLAYER_HEAD.parseMaterial());
        guiAutoSellsBackLore = languages.getStringList("gui.autosells.back.lore");
        guiAutoSellsBackHead = languages.getString("gui.autosells.back.head","MHF_ArrowLeft");
        guiAutoSellsBackName = languages.getString("gui.autosells.back.name","&6&lBack");
        guiAutoSellsBackCustomModelData = languages.getInt("gui.autosells.back.custom-model-data");
        autoSellsClaimMoneySuccess = languages.getString("autosells.claim-money-success","&aMoney claimed successfully!");
        autoSellsClaimMoneyFail = languages.getString("autosells.claim-money-fail","&cThis chest does not have enough money to claim!");
        guiSmelterIconMaterial = fetchMaterial("gui.smeltericon.material",XMaterial.PLAYER_HEAD.parseMaterial());
        guiSmelterIconName = languages.getString("gui.smeltericon.name","&4&lSmelt items!");
        guiSmelterIconHead = languages.getString("gui.smeltericon.head","MCadir1");
        guiSmelterIconPriceFormat = languages.getString("gui.smeltericon.price-format","&ePrice&6: &e%price%&6$");
        guiSmelterIconLore = languages.getStringList("gui.smeltericon.lore");
        guiSmelterIconCustomModelData = languages.getInt("gui.smeltericon.custom-model-data");
        smeltingNotEnoughMoney = languages.getString("smeltings.not-enough-money","&cYou do not have enough money to smelt this chest");
        smeltingOnSuccess = languages.getString("smeltings.success","&aYou have smelted this chest correctly!");
        smeltingOnFail = languages.getString("smeltings.fail","&cThis chest does not contain anything to smelt!");
        guiCompressorIconMaterial = fetchMaterial("gui.compressoricon.material",XMaterial.PLAYER_HEAD.parseMaterial());
        guiCompressorIconName = languages.getString("gui.compressoricon.name","&f&lCompress items!");
        guiCompressorIconHead = languages.getString("gui.compressoricon.head","9a1057aeb571b23c907284f907f51a1f18530d731a8adac02c791aa205b56c1e");
        guiCompressorIconPriceFormat = languages.getString("gui.compressoricon.price-format","&ePrice&6: &e%price%&6$");
        guiCompressorIconLore = languages.getStringList("gui.compressoricon.lore");
        guiCompressorIconCustomModelData = languages.getInt("gui.compressoricon.custom-model-data");
        compressionNotEnoughMoney = languages.getString("compressions.not-enough-money","&cYou do not have enough money to compress this chest");
        compressionNotEnoughSpaceToCompress = languages.getString("compressions.not-enough-space-to-compress","&cThere is not enough space to compress this chest!");
        compressionOnSuccess = languages.getString("compressions.success","&aYou have compressed this chest correctly!");
        compressionAnythingToCompress = languages.getString("compressions.anything-to-compress","&cThere is anything to compress in this chest!");
        compressionOnCompressProcess = languages.getString("compressions.process","&cThe chest will be compress in &6%time% &cseconds&6!");
        openChestOnCompressionFail = languages.getString("compressions.openchest-oncompression-fail","&cThis chest is currently being compressed, please wait...&6!");
    }

    /**
     * Gets the Material of an specified ConfigurationSection path.
     *
     * @param path the ConfigurationSection path
     * @param defaultMaterial the default material to return
     * @return the found material, if the material is not found it will return the specified default material.
     */
    private Material fetchMaterial(String path,Material defaultMaterial){
        try {
            String materialString = languages.getString(path,defaultMaterial.toString());
            if(materialString.equals("SKULL_ITEM"))return XMaterial.PLAYER_HEAD.parseMaterial();
            Optional<XMaterial> xMaterial = XMaterial.matchXMaterial(materialString);
            if(xMaterial.isPresent()){
                Material material = xMaterial.get().parseMaterial();
                if(material != null) {
                    return material;
                }else return defaultMaterial;
            }else return defaultMaterial;
        }catch (IllegalArgumentException e){
            return defaultMaterial;
        }
    }

    /**
     * Replaces a specified placeholder in a message.
     *
     * @param message the message
     * @param placeholder the placeholder to replace
     * @param replacement the replacement of the placeholder
     * @return the string with the replaced placeholder.
     */
    private String replacePlaceholders(String message, String placeholder, String replacement){
        if(message.contains(placeholder)){
            message = message.replaceAll(placeholder,replacement);
        }
        return message;
    }
}
