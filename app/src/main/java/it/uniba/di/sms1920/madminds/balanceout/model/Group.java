package it.uniba.di.sms1920.madminds.balanceout.model;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.*;

public class Group implements Serializable {

    public static final String GROUP="GROUP";
    public static final String ID_GROUP="idGroup";
    public static final String NAME_GROUP="nameGroup";
    public static final String CREATION_DATA_GROUP ="creationDataGroup";
    public static final String IMG_GROUP="imgGroup";
    public static final String MEMBERS="members";
    public static final String UID_MEMEBRS="uidMembers";
    public static final String ID_AMMINISTRATOR="idAmministrator";
    public static final String SEMPLIFICATION_DEBTS="semplificationDebts";
    public static final String PUBLIC_MOVEMENTS="publicMovements";
    public static final String STATUS_DEBIT_GROUP="statusDebitGroup";
    public static final String AMOUNT_DEBIT="amountDebit";
    public static final String ACTIVE="active";


    private String idGroup;
    private String nameGroup;
    private Date creationDataGroup;
    private String imgGroup;
    private ArrayList<User> members;
    private ArrayList<String> uidMembers;
    private String idAmministrator;
    private boolean semplificationDebts;
    private boolean publicMovements;

    /* per ogni account, se esso è in debito col gruppo  statusDebitGroup = -1
     *  se è in pari statusDebitGroup = 0
     *  se deve ricevere un credito statusDebitGroup = 1 */
    private int statusDebitGroup;
    private double amountDebit;
    private boolean active;


    public Group(String idGroup,
                 String nameGroup,
                 Date creationDataGroup,
                 String imgGroup,
                 ArrayList<User> members,
                 ArrayList<String> uidMembers,
                 String idAmministrator,
                 int statusDebitGroup,
                 double amountDebit,
                 boolean active,
                 boolean semplificationDebts,
                 boolean publicMovements) {
        this.idGroup = idGroup;
        this.nameGroup = nameGroup;
        this.creationDataGroup = creationDataGroup;
        this.imgGroup = imgGroup;
        this.members = members;
        this.uidMembers = uidMembers;
        this.idAmministrator = idAmministrator;
        this.statusDebitGroup = statusDebitGroup;
        this.amountDebit = amountDebit;
        this.active = active;
        this.semplificationDebts = semplificationDebts;
        this.publicMovements = publicMovements;
    }

    public String getIdGroup() {
        return idGroup;
    }

    public String getNameGroup() {
        return nameGroup;
    }

    public int getStatusDebitGroup() {
        return statusDebitGroup;
    }

    public Date getCreationDataGroup() {
        return creationDataGroup;
    }

    public String getIdAmministrator() {
        return idAmministrator;
    }

    public double getAmountDebit() {
        return amountDebit;
    }

    public boolean isActive() {
        return active;
    }

    public ArrayList<User> getMembers() {
        return members;
    }

    public String getImgGroup() {
        return imgGroup;
    }

    public void setImgGroup(String imgGroup) {
        this.imgGroup = imgGroup;
    }

    public ArrayList<String> getUidMembers() {
        return uidMembers;
    }

    public void setUidMembers(ArrayList<String> uidMembers) {
        this.uidMembers = uidMembers;
    }

    public boolean isSemplificationDebts() {
        return semplificationDebts;
    }

    public boolean isPublicMovements() {
        return publicMovements;
    }

    public Map<String, Object> toMap() {
        HashMap<String, Object> result = new HashMap<>();

        result.put(ID_GROUP, idGroup);
        result.put(NAME_GROUP, nameGroup);
        result.put(CREATION_DATA_GROUP, new SimpleDateFormat("dd/MM/yyyy").format(creationDataGroup));
        result.put(IMG_GROUP, imgGroup);
        result.put(MEMBERS, members);
        result.put(UID_MEMEBRS, uidMembers);
        result.put(ID_AMMINISTRATOR, idAmministrator);
        result.put(STATUS_DEBIT_GROUP, statusDebitGroup);
        result.put(AMOUNT_DEBIT, amountDebit);
        result.put(ACTIVE, active);
        result.put(SEMPLIFICATION_DEBTS, semplificationDebts);
        result.put(PUBLIC_MOVEMENTS, publicMovements);

        return result;
    }

}