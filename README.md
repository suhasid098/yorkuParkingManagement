# Parking Lot App - EECS 3311

The codebase simulates a parking lot app that allows users to book a parking lot in advance with multiple modes of payment. There are 4 types of users, Students, Faculty, Non-Faculty, and Visitors, all of which have their individualized rates and can edit and cancel their booking. Furthermore, this app offers a separate interface for Managers and SuperManagers which regulate the account creation (account verification and creation) and parking lots (disable or enable).

As a software engineering student, I was part of the YorkU Parking Management Project Team for a class that worked on a GUI-based Java project for a new booking system. Our goal was to enhance online booking services for clients, including students, faculty members, non-faculty staff, and visitors. The system allowed any client to register with a unique email and strong password, and it accommodated four client types, with provisions for potential future types.

During the project, we implemented an auto account generation subsystem that allowed the super manager to create management accounts with unique names and strong passwords. These accounts were crucial for the management team to log in and maintain the parking services efficiently.

One of the core features we developed was the ability for registered clients to book valid parking spaces that were not currently occupied by other users. The booking rates varied for different user types: $5 for students, $8 for faculty members, $10 for non-faculty staff, and $15 for visitors per hour.

To make a booking, clients were required to provide a deposit equivalent to the cost of an hour's parking based on their user type. If there was a no-show within the first hour of the booked period, the deposit would not be refunded. Otherwise, the deposit would be deducted upon checking out.

We integrated sensors in each parking space to detect car usage and scan basic car information, which was then sent to the system for further processing.

As part of the management features, we enabled managers to add, enable, or disable entire parking lots, each containing 100 parking spaces. They also had the option to enable or disable individual parking spaces in case of maintenance issues.

For user convenience, each parking space was uniquely identified and had additional details, including its location and the corresponding parking lot, making navigation easier for clients.

Booking a parking space required clients to provide a valid license plate number. We implemented functionality to allow clients to edit or cancel their bookings before the starting time of the reservation. Additionally, clients could extend their parking time before the expiration if needed.

To cater to various payment preferences, we provided clients with multiple options for paying their parking fees, such as debit cards, credit cards, mobile payments, and more.

Throughout the project, we worked diligently to ensure the system met all the specified requirements and provided a seamless and efficient parking management solution for York University's parking services.
