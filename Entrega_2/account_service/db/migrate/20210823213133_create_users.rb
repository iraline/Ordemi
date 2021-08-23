class CreateUsers < ActiveRecord::Migration[6.1]
  def change
    create_table :users do |t|
      t.integer :auth_id
      
      t.string :first_name
      t.string :last_name
      t.string :role
      t.string :plan

      t.timestamps
    end
  end
end
