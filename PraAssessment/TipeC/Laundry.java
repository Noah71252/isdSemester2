package TipeC;

import java.util.LinkedList;

public class Laundry {
    LinkedList<Member> members = new LinkedList<>();

    public void addMember(String noMember, String nama, String alamat, String tipeMember, int lamaMenjadiMember) {
        Member member = new Member(noMember, nama, alamat, tipeMember, lamaMenjadiMember);
        members.add(member);
        System.out.println("Member " + nama + " telah ditambahkan.");
    }

    public void removeMember(String noMember) {
        members.removeIf(member -> member.noMember.equals(noMember));
        System.out.println("Member dengan no " + noMember + " telah dihapus.");
    }

    public void searchMember(String nama) {
        for (Member member : members) {
            if (member.nama.equals(nama)) {
                System.out.println("No Member: " + member.noMember + ", Nama: " + member.nama + ", Alamat: " + member.alamat + ", Tipe Member: " + member.tipeMember + ", Lama Menjadi Member: " + member.lamaMenjadiMember + " tahun");
            }
        }
    }

    public void filterMembers(int years) {
        System.out.println("Member yang telah menjadi pelanggan lebih dari " + years + " tahun:");
        for (Member member : members) {
            if (member.lamaMenjadiMember > years) {
                System.out.println("No Member: " + member.noMember + ", Nama: " + member.nama + ", Alamat: " + member.alamat + ", Tipe Member: " + member.tipeMember + ", Lama Menjadi Member: " + member.lamaMenjadiMember + " tahun");
            }
        }
    }
}
