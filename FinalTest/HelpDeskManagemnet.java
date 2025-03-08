package FinalTest;

enum Category {
    SOFTWARE, HARDWARE
}

class Employee {
    String fullName;
    int pointLevel;
    Category assignedCategory;

    Employee(String fullName, int pointLevel, Category assignedCategory) {
        this.fullName = fullName;
        this.pointLevel = pointLevel;
        this.assignedCategory = assignedCategory;
    }
}

class Ticket {
    int id;
    String name;
    Category category;
    int point;
    String assingnedEmployee;
    boolean isCompleted;

    Ticket(int id, String name, Category category, int point) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.point = point;
    }
}

class HelpDesk {
    Employee emp1, emp2;
    Ticket t1, t2, t3, t4, t5;

    void addEmployee(Employee e, int pos) {
        if (pos == 1) {
            emp1 = e;
        } else if (pos == 2) {
            emp2 = e;
        } else {
            System.out.println("Invalid Position");
        }
    }

    void addTicket(Ticket t, int pos) {
        if (pos == 1) {
            t1 = t;
        } else if (pos == 2) {
            t2 = t;
        } else if (pos == 3) {
            t3 = t;
        } else if (pos == 4) {
            t4 = t;
        } else if (pos == 5) {
            t5 = t;
        } else {
            System.out.println("Invalid ticket");
        }
    }

    void CompleteTicket(String employeeName, int ticketId) {
        Employee employee = null;
        if (emp1 != null && emp1.fullName.equals(employeeName)) {
            employee = emp1;
        } else if (emp2 != null && emp2.fullName.equals(employeeName)) {
            employee = emp2;
        } else {
            System.out.println("Employee not found");
        }

        Ticket ticket = null;
        if (t1 != null && t1.id == ticketId) {
            ticket = t1;
        } else if (t2 != null && t2.id == ticketId) {
            ticket = t2;
        } else if (t3 != null && t3.id == ticketId) {
            ticket = t3;
        } else if (t4 != null && t4.id == ticketId) {
            ticket = t4;
        } else if (t5 != null && t5.id == ticketId) {
            ticket = t5;
        } else {
            System.out.println("Ticket not found");
        }

        if (ticket.isCompleted) {
            System.out.println("Ticket already completed");
        }

        if (employee.pointLevel >= ticket.point) {
            ticket.isCompleted = true;
            ticket.assingnedEmployee = employee.fullName;
            System.out.println("Ticket " + ticketId + " completed by " + employeeName);
        } else {
            System.out.println("Not enough points");
        }
    }

    int getWaitingTicketCount() {
        int count = 0;
        if (t1 != null && !t1.isCompleted)
            count++;
        if (t2 != null && !t2.isCompleted)
            count++;
        if (t3 != null && !t3.isCompleted)
            count++;
        if (t4 != null && !t4.isCompleted)
            count++;
        if (t5 != null && !t5.isCompleted)
            count++;
        return count;
    }

    int getCompletedTicketsTotalPoint() {
        int totalPoints = 0;
        if (t1 != null && t1.isCompleted)
            totalPoints += t1.point;
        if (t2 != null && t2.isCompleted)
            totalPoints += t2.point;
        if (t3 != null && t3.isCompleted)
            totalPoints += t3.point;
        if (t4 != null && t4.isCompleted)
            totalPoints += t4.point;
        if (t5 != null && t5.isCompleted)
            totalPoints += t5.point;
        return totalPoints;
    }

}

public class HelpDeskManagemnet {
    public static void main(String args[]) {
        HelpDesk helpDesk = new HelpDesk();

        Employee alice = new Employee("Alice Brown", 5, Category.SOFTWARE);
        Employee bob = new Employee("Bob Smith", 8, Category.HARDWARE);

        helpDesk.addEmployee(alice, 1);
        helpDesk.addEmployee(bob, 2);

        Ticket t1 = new Ticket(101, "Software Bug", Category.SOFTWARE, 4);
        Ticket t2 = new Ticket(102, "Network Issue", Category.HARDWARE, 7);
        Ticket t3 = new Ticket(103, "System Crash", Category.HARDWARE, 10);
        Ticket t4 = new Ticket(104, "Printer Not Working", Category.HARDWARE, 3);
        Ticket t5 = new Ticket(105, "UI Bug", Category.SOFTWARE, 2);

        helpDesk.addTicket(t1, 1);
        helpDesk.addTicket(t2, 2);
        helpDesk.addTicket(t3, 3);
        helpDesk.addTicket(t4, 4);
        helpDesk.addTicket(t5, 5);

        helpDesk.CompleteTicket("Alice Brown", 101);
        helpDesk.CompleteTicket("Bob Smith", 102);
        helpDesk.CompleteTicket("Alice Brown", 103);
        helpDesk.CompleteTicket("Bob Smith", 104);
        helpDesk.CompleteTicket("Alice Brown", 105);

        System.out.println(helpDesk.getWaitingTicketCount());
        System.out.println(helpDesk.getCompletedTicketsTotalPoint());
    }
}
