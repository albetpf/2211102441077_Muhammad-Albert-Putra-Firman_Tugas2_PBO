import greenfoot.*; // Import Greenfoot

public class clouds extends Actor
{
    private int speed = -2; // Kecepatan gerakan awan ke kiri

    public clouds()
    {
        // Konstruktor clouds, dipanggil saat objek clouds dibuat
        // Inisialisasi gambar awan dari file PNG
        GreenfootImage image = new GreenfootImage("clouds.png");
        setImage(image); // Mengatur gambar awan untuk objek clouds
    }

    public void act()
    {
        move(-2); // Menggerakkan objek clouds ke kiri dengan kecepatan -2

        if(getX() <= 40){
            // Jika posisi awan mencapai batas kiri dunia (posisi X <= 40), maka
            setLocation(getWorld().getWidth(), Greenfoot.getRandomNumber(getWorld().getHeight()));
            // Mengatur ulang posisi awan ke sisi kanan dunia dengan posisi Y acak
        }
    }
}
