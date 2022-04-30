package com.czxbnb.eorzea.model

import com.google.gson.annotations.SerializedName

data class LodestoneCharacter(
    @SerializedName("Achievements") val achievements: Achievements,
    @SerializedName("AchievementsPublic") val achievementsPublic: Boolean,
    @SerializedName("character") val character: Character,
    @SerializedName("FreeCompany") val freeCompany: FreeCompany,
    @SerializedName("Friends") val friends: List<Friend>,
    @SerializedName("FriendsPublic") val friendsPublic: Boolean,
    @SerializedName("Minions") val minions: List<Minion>,
    @SerializedName("Mounts") val mounts: List<Mount>,
) {
    data class Achievements(
        @SerializedName("List") val achievementList: List<Achievement>,
        @SerializedName("Points") val point: Int
    )

    data class Achievement(
        @SerializedName("Date") val date: Int,
        @SerializedName("ID") val id: Int,
        @SerializedName("Icon") val icon: String,
        @SerializedName("Name") val name: String,
        @SerializedName("Points") val points: Int
    )

    data class Character(
        @SerializedName("ActiveClassJob") val activeClassJob: ActiveClassJob,
        @SerializedName("Avatar") val avatar: String,
        @SerializedName("Bio") val bio: String,
        @SerializedName("ClassJobs") val classJobs: List<ClassJob>,
        @SerializedName("ClassJobsBozjan") val classJobsBozjan: ClassJobsBozjan,
        @SerializedName("ClassJobsElemental") val classJobsElemental: ClassJobsElemental,
        @SerializedName("DC") val dc: String,
        @SerializedName("FreeCompanyId") val freeCompanyId: String,
        @SerializedName("FreeCompanyName") val freeCompanyName: String,
        @SerializedName("GearSet") val gearSet: GearSet,
        @SerializedName("Gender") val gender: Int,
        @SerializedName("GenderID") val genderID: Int,
        @SerializedName("GrandCompany") val grandCompany: GrandCompany,
        @SerializedName("GuardianDeity") val guardianDeity: GuardianDeity,
        @SerializedName("ID") val id: Int,
        @SerializedName("Name") val name: String,
        @SerializedName("Nameday") val nameday: String,
        @SerializedName("ParseDate") val parseDate: Int,
        @SerializedName("Portrait") val portrait: String,
        @SerializedName("PvPTeamId") val pvpTeamId: Any,
        @SerializedName("Race") val race: Race,
        @SerializedName("Server") val server: String,
        @SerializedName("Title") val title: Title,
        @SerializedName("TitleTop") val titleTop: Boolean,
        @SerializedName("Town") val town: Town,
        @SerializedName("Tribe") val tribe: Tribe
    )

    data class ActiveClassJob(
        @SerializedName("Class") val `class`: Class,
        @SerializedName("ExpLevel") val expLevel: Int,
        @SerializedName("ExpLevelMax") val expLevelMax: Int,
        @SerializedName("ExpLevelTogo") val expLevelTogo: Int,
        @SerializedName("IsSpecialised") val isSpecialised: Boolean,
        @SerializedName("Job") val job: Job,
        @SerializedName("Level") val level: Int,
        @SerializedName("Name") val name: String,
        @SerializedName("UnlockedState") val unlockedState: UnlockedState
    )

    data class Class(
        @SerializedName("Abbreviation") val abbreviation: String,
        @SerializedName("ClassJobCategory") val classJobCategory: ClassJobCategory,
        @SerializedName("ID") val id: Int,
        @SerializedName("Icon") val icon: String,
        @SerializedName("Name") val name: String,
        @SerializedName("Url") val url: String
    )

    data class Job(
        @SerializedName("Abbreviation") val abbreviation: String,
        @SerializedName("ID") val id: Int,
        @SerializedName("Icon") val icon: String,
        @SerializedName("Name") val name: String,
        @SerializedName("Url") val url: String
    )

    data class UnlockedState(
        @SerializedName("ID") val id: Int,
        @SerializedName("Name") val name: String
    )

    data class ClassJobCategory(
        @SerializedName("ID") val id: Int,
        @SerializedName("Name") val name: String
    )

    data class ClassJob(
        @SerializedName("Class") val `class`: Class,
        @SerializedName("ExpLevel") val expLevel: Int,
        @SerializedName("ExpLevelMax") val expLevelMax: Int,
        @SerializedName("ExpLevelTogo") val expLevelTogo: Int,
        @SerializedName("IsSpecialised") val isSpecialised: Boolean,
        @SerializedName("Job") val job: Job,
        @SerializedName("Level") val level: Int,
        @SerializedName("Name") val name: String,
        @SerializedName("UnlockedState") val unlockedState: UnlockedState
    )

    data class ClassJobsBozjan(
        @SerializedName("Level") val level: Int,
        @SerializedName("Mettle") val mettle: Int,
        @SerializedName("Name") val name: String
    )

    data class ClassJobsElemental(
        @SerializedName("ExpLevel") val expLevel: Int,
        @SerializedName("ExpLevelMax") val expLevelMax: Int,
        @SerializedName("ExpLevelTogo") val expLevelTogo: Int,
        @SerializedName("Level") val level: Int,
        @SerializedName("Name") val name: String
    )

    data class GearSet(
        @SerializedName("Class") val `class`: Class,
        @SerializedName("Gear") val gear: Gear,
        @SerializedName("GearKey") val gearKey: String,
        @SerializedName("Job") val job: Job,
        @SerializedName("Level") val level: Int
    )

    data class GrandCompany(
        @SerializedName("Company") val company: Company,
        @SerializedName("Rank") val rank: Rank
    )

    data class GuardianDeity(
        @SerializedName("GuardianDeity") val guardianDeity: Any,
        @SerializedName("ID") val id: Int,
        @SerializedName("Icon") val icon: String,
        @SerializedName("Name") val name: String,
        @SerializedName("Url") val url: String
    )

    data class Race(
        @SerializedName("ID") val id: Int,
        @SerializedName("Name") val name: String,
        @SerializedName("Url") val url: String
    )

    data class Title(
        @SerializedName("ID") val id: Int,
        @SerializedName("Icon") val icon: String,
        @SerializedName("Name") val name: String,
        @SerializedName("Url") val url: String
    )

    data class Town(
        @SerializedName("ID") val id: Int,
        @SerializedName("Icon") val icon: String,
        @SerializedName("Name") val name: String,
        @SerializedName("Url") val url: String
    )

    data class Tribe(
        @SerializedName("ID") val id: Int,
        @SerializedName("Icon") val icon: String,
        @SerializedName("Name") val name: String,
        @SerializedName("Url") val url: String
    )

    data class Gear(
        @SerializedName("Body") val body: GearInfo,
        @SerializedName("Bracelets") val bracelets: GearInfo,
        @SerializedName("Earrings") val earrings: GearInfo,
        @SerializedName("Feet") val feet: GearInfo,
        @SerializedName("Hands") val hands: GearInfo,
        @SerializedName("Head") val head: GearInfo,
        @SerializedName("Legs") val legs: GearInfo,
        @SerializedName("MainHand") val mainHand: GearInfo,
        @SerializedName("Necklace") val necklace: GearInfo,
        @SerializedName("Ring1") val ring1: GearInfo,
        @SerializedName("Ring2") val ring2: GearInfo,
        @SerializedName("SoulCrystal") val soulCrystal: GearInfo
    )

    data class GearInfo(
        @SerializedName("Dye") val dye: Dye,
        @SerializedName("Item") val item: Item,
        @SerializedName("Materia") val materia: List<Materia>,
        @SerializedName("Mirage") val mirage: Mirage
    )

    data class Dye(
        @SerializedName("ID") val id: Int,
        @SerializedName("Icon") val icon: String,
        @SerializedName("Name") val name: String
    )

    data class Item(
        @SerializedName("ClassJobCategory") val classJobCategory: ClassJobCategory,
        @SerializedName("ID") val id: Int,
        @SerializedName("Icon") val icon: String,
        @SerializedName("ItemUICategory") val itemUICategory: ItemUICategory,
        @SerializedName("LevelEquip") val levelEquip: Int,
        @SerializedName("LevelItem") val levelItem: Int,
        @SerializedName("Name") val name: String,
        @SerializedName("Rarity") val rarity: Int
    )

    data class Materia(
        @SerializedName("ID") val id: Int,
        @SerializedName("Icon") val icon: String,
        @SerializedName("Name") val name: String,
        @SerializedName("Url") val url: String
    )

    data class Mirage(
        @SerializedName("ID") val id: Int,
        @SerializedName("Icon") val icon: String,
        @SerializedName("Name") val name: String
    )

    data class ItemUICategory(
        @SerializedName("ID") val id: Int,
        @SerializedName("Name") val name: String
    )

    data class Company(
        @SerializedName("ID") val id: Int,
        @SerializedName("Name") val name: String,
        @SerializedName("Url") val url: String
    )

    data class Rank(
        @SerializedName("ID") val id: Int,
        @SerializedName("Icon") val icon: String,
        @SerializedName("Name") val name: String,
        @SerializedName("Url") val url: String
    )

    data class FreeCompany(
        @SerializedName("Active") val active: String,
        @SerializedName("ActiveMemberCount") val activeMemberCount: Int,
        @SerializedName("Crest") val crest: List<String>,
        @SerializedName("DC") val dc: String,
        @SerializedName("Estate") val estate: Estate,
        @SerializedName("Focus") val focus: List<Focus>,
        @SerializedName("Formed") val formed: Int,
        @SerializedName("GrandCompany") val grandCompany: String,
        @SerializedName("ID") val id: String,
        @SerializedName("Name") val name: String,
        @SerializedName("ParseDate") val parseDate: Int,
        @SerializedName("Rank") val rank: Int,
        @SerializedName("Ranking") val ranking: Ranking,
        @SerializedName("Recruitment") val recruitment: String,
        @SerializedName("Reputation") val reputation: List<Reputation>,
        @SerializedName("Seeking") val seeking: List<Seeking>,
        @SerializedName("Server") val server: String,
        @SerializedName("Slogan") val slogan: String,
        @SerializedName("Tag") val tag: String
    )

    data class Estate(
        @SerializedName("Greeting") val greeting: Any,
        @SerializedName("Name") val name: Any,
        @SerializedName("Plot") val plot: Any
    )

    data class Focus(
        @SerializedName("icon") val Icon: String,
        @SerializedName("name") val Name: String,
        @SerializedName("status") val Status: Boolean
    )

    data class Ranking(
        @SerializedName("Monthly") val monthly: Int,
        @SerializedName("Weekly") val weekly: Int
    )

    data class Reputation(
        @SerializedName("Name") val name: String,
        @SerializedName("Progress") val progress: Int,
        @SerializedName("Rank") val rank: String
    )

    data class Seeking(
        @SerializedName("Icon") val icon: String,
        @SerializedName("Name") val name: String,
        @SerializedName("Status") val status: Boolean
    )

    data class Friend(
        @SerializedName("Avatar") val avatar: String,
        @SerializedName("FeastMatches") val feastMatches: Int,
        @SerializedName("ID") val id: Int,
        @SerializedName("Lang") val lang: String,
        @SerializedName("Name") val name: String,
        @SerializedName("Rank") val rank: Any,
        @SerializedName("RankIcon") val rankIcon: Any,
        @SerializedName("Server") val server: String
    )

    data class Minion(
        @SerializedName("Icon") val icon: String,
        @SerializedName("Name") val mame: String
    )

    data class Mount(
        @SerializedName("Icon") val icon: String,
        @SerializedName("Name") val mame: String
    )
}
