class User < ApplicationRecord

  # Validations
  validates :auth_id, presence: true, uniqueness: true
  validates :first_name, presence: true
  validates :last_name, presence: true
  validates :role, presence: true
   
end
